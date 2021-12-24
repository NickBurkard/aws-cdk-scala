# AWS CDK Scala [![Scala Steward badge](https://img.shields.io/badge/Scala_Steward-helping-blue.svg?style=flat&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAQCAMAAAARSr4IAAAAVFBMVEUAAACHjojlOy5NWlrKzcYRKjGFjIbp293YycuLa3pYY2LSqql4f3pCUFTgSjNodYRmcXUsPD/NTTbjRS+2jomhgnzNc223cGvZS0HaSD0XLjbaSjElhIr+AAAAAXRSTlMAQObYZgAAAHlJREFUCNdNyosOwyAIhWHAQS1Vt7a77/3fcxxdmv0xwmckutAR1nkm4ggbyEcg/wWmlGLDAA3oL50xi6fk5ffZ3E2E3QfZDCcCN2YtbEWZt+Drc6u6rlqv7Uk0LdKqqr5rk2UCRXOk0vmQKGfc94nOJyQjouF9H/wCc9gECEYfONoAAAAASUVORK5CYII=)](https://scala-steward.org)

- [Overview](#overview)
- [Installation](#installation)
- [Usage](#usage)
- [Limitations](#limitations)
- [Acknowledgements](#acknowledgements)

# Overview

Scala DSL for [AWS CDK v2](https://docs.aws.amazon.com/cdk/latest/guide/work-with-cdk-v2.html).

### Purpose

- Pass around app & stack [scope](https://docs.aws.amazon.com/cdk/latest/guide/constructs.html) implicitly.
- Avoid using Java concepts.
  * No builder syntax.
  * Required & optional parameters.
  * ADTs instead of enums.
  * Scala collections (i.e. `List` & `Map`).

### Disclaimer

This library solely provides a lightweight DSL over the AWS CDK using metaprogramming.
Please refer to the underlying types from the AWS CDK along with the associated CloudFormation types
for official & up-to-date service documentation.

### Release Cadence

- Major, minor and patch versions are increased each time [aws-cdk-lib](https://mvnrepository.com/artifact/software.amazon.awscdk/aws-cdk-lib) increases associated versions.
- Patch version is increased for any non-breaking changes made to the DSL itself.

### Scala Support

| Version | Supported? |
| --- | --- |
| <= 2.11 | ❌ |
| 2.12 | ✔️|
| 2.13 | ✔️|
| 3 | ✔️|

Anything <= 2.11 will **not** be supported. Please do not ask or submit PRs for those versions.

# Installation

### CDK CLI

You must install v2 of the [CDK CLI](https://docs.aws.amazon.com/cdk/latest/guide/cli.html)
to synthesize CloudFormation templates.

```bash
npm install -g aws-cdk
```

### Library

Just like CDK v2, a single dependency is published for the DSL.

The latest version can be found on [mvn](https://mvnrepository.com/artifact/io.burkard/aws-cdk-scala)
and on the [releases](https://github.com/NickBurkard/aws-cdk-scala/releases) page.

```scala
val cdkVersion: String = ???

libraryDependencies += "io.burkard" %% "aws-cdk-scala" % cdkVersion
```

# Usage

### Scala

Create a CDK app within a module of your project.

```scala
package io.burkard.cdk.example

import io.burkard.cdk._
import io.burkard.cdk.metadata._
import io.burkard.cdk.services.kinesisanalytics._
import io.burkard.cdk.services.kinesisanalytics.cfnApplicationV2._
import io.burkard.cdk.services.s3._

object ExampleApp extends CdkApp {
  CdkStack(id = Some("ExampleStack")) { implicit stackCtx =>
    val envParameter = CfnTypedParameter.CfnStringParameter(
      name = "env",
      allowedValues = Some(List("dev", "qa", "prod"))
    )
    val regionParameter = CfnTypedParameter.CfnStringParameter(
      name = "region",
      allowedValues = Some(List("us-east-1", "us-west-2", "eu-west-1"))
    )

    stackCtx.setCloudFormationInterface(
      CloudFormationInterface.build(
        Some(Label("example parameters")) -> List(envParameter, regionParameter)
      )()
    )

    val env = envParameter.value
    val region = regionParameter.value

    val bucket = Bucket(
      internalResourceId = "Code",
      accessControl = Some(BucketAccessControl.Private),
      enforceSsl = Some(true),
      encryption = Some(BucketEncryption.S3Managed),
      versioned = Some(true)
    )

    CfnApplicationV2(
      internalResourceId = "Runtime",
      serviceExecutionRole = "arn:example-role",
      runtimeEnvironment = "FLINK-1_13",
      tags = Some(
        List(
          CfnTag(key = "env", value = env),
          CfnTag(key = "region", value = region)
        )
      ),
      applicationName = Some(s"prefix-$env-app-name-$region"),
      applicationConfiguration = Some(
        ApplicationConfigurationProperty(
          applicationCodeConfiguration = Some(
            ApplicationCodeConfigurationProperty(
              codeContent = CodeContentProperty(
                s3ContentLocation = Some(
                  S3ContentLocationProperty(
                    fileKey = Some("code-key-in-s3"),
                    bucketArn = Some(bucket.getBucketArn),
                    objectVersion = Some("code-version")
                  )
                )
              ),
              codeContentType = "ZIPFILE"
            )
          )
        )
      )
    )
  }
}
```

### CDK Configuration

Create a `cdk.json` file at the root of your project, specifying the command to run your CDK app.

```json
{
  "app": "sbt \"example/runMain io.burkard.cdk.example.ExampleApp\""
}
```

### Synthesis

Synthesize the application.

```bash
cdk synth
```

The result is a CloudFormation template in YAML.

```yaml
Metadata:
  AWS::CloudFormation::Interface:
    ParameterGroups:
      - Label:
          default: example parameters
        Parameters:
          - env
          - region
Parameters:
  env:
    Type: String
    AllowedValues:
      - dev
      - qa
      - prod
    NoEcho: false
  region:
    Type: String
    AllowedValues:
      - us-east-1
      - us-west-2
      - eu-west-1
    NoEcho: false
  BootstrapVersion:
    Type: AWS::SSM::Parameter::Value<String>
    Default: /cdk-bootstrap/hnb659fds/version
    Description: Version of the CDK Bootstrap resources in this environment, automatically retrieved from SSM Parameter Store. [cdk:skip]
Resources:
  Code5B760EEF:
    Type: AWS::S3::Bucket
    Properties:
      AccessControl: Private
      BucketEncryption:
        ServerSideEncryptionConfiguration:
          - ServerSideEncryptionByDefault:
              SSEAlgorithm: AES256
      VersioningConfiguration:
        Status: Enabled
    UpdateReplacePolicy: Retain
    DeletionPolicy: Retain
    Metadata:
      aws:cdk:path: ExampleStack/Code/Resource
  CodePolicyAA48735C:
    Type: AWS::S3::BucketPolicy
    Properties:
      Bucket:
        Ref: Code5B760EEF
      PolicyDocument:
        Statement:
          - Action: s3:*
            Condition:
              Bool:
                aws:SecureTransport: "false"
            Effect: Deny
            Principal:
              AWS: "*"
            Resource:
              - Fn::GetAtt:
                  - Code5B760EEF
                  - Arn
              - Fn::Join:
                  - ""
                  - - Fn::GetAtt:
                        - Code5B760EEF
                        - Arn
                    - /*
        Version: "2012-10-17"
    Metadata:
      aws:cdk:path: ExampleStack/Code/Policy/Resource
  Runtime:
    Type: AWS::KinesisAnalyticsV2::Application
    Properties:
      RuntimeEnvironment: FLINK-1_13
      ServiceExecutionRole: arn:example-role
      ApplicationConfiguration:
        ApplicationCodeConfiguration:
          CodeContent:
            S3ContentLocation:
              BucketARN:
                Fn::GetAtt:
                  - Code5B760EEF
                  - Arn
              FileKey: code-key-in-s3
              ObjectVersion: code-version
          CodeContentType: ZIPFILE
      ApplicationName:
        Fn::Join:
          - ""
          - - prefix-
            - Ref: env
            - -app-name-
            - Ref: region
      Tags:
        - Key: env
          Value:
            Ref: env
        - Key: region
          Value:
            Ref: region
    Metadata:
      aws:cdk:path: ExampleStack/Runtime
```

# Limitations

- Builders which use overloading for optional parameters (same name but different types)
are represented as `paramName0`, `paramName1`, etc..

# Acknowledgements

- Inspired by [AWS CDK Kotlin DSL](https://github.com/Semantic-Configuration/AWS-CDK-Kotlin-DSL).
