# AWS CDK Scala

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
  * ADTs instead of enums.
  * Scala collections (i.e. `List` & `Map`).

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
# Note `@next`, this installs v2.
npm install -g aws-cdk@next
```

### Library

Libraries are published for each AWS service, plus a `core` library for shared resources.
Please refer to the [modules](./modules) directory to reference generated code.

# Usage

### Scala

Create a CDK app within a module of your project.

```scala
package io.burkard.cdk.example

import io.burkard.cdk._
import io.burkard.cdk.core.CfnTag
import io.burkard.cdk.services.kinesisanalytics._
import io.burkard.cdk.services.s3._

object ExampleApp extends App {
  private[this] val env = "dev"
  private[this] val region = "us-east-1"

  Stack(id = Some("ExampleStack")) { implicit stackCtx =>
    val bucket = Bucket(
      internalResourceId = "Code",
      accessControl = Some(BucketAccessControl.Private),
      enforceSsl = Some(true),
      encryption = Some(BucketEncryption.S3Managed),
      versioned = Some(true)
    )

    CfnApplicationV2(
      internalResourceId = "Runtime",
      tags = Some(
        List(
          CfnTag(key = Some("env"), value = Some(env)),
          CfnTag(key = Some("region"), value = Some(region))
        )
      ),
      applicationName = Some(s"prefix-$env-app-name-$region"),
      applicationConfiguration = Some(
        ApplicationConfigurationProperty(
          applicationCodeConfiguration = Some(
            ApplicationCodeConfigurationProperty(
              codeContent = Some(
                CodeContentProperty(
                  s3ContentLocation = Some(
                    S3ContentLocationProperty(
                      fileKey = Some("code-key-in-s3"),
                      bucketArn = Some(bucket.getBucketArn),
                      objectVersion = Some("code-version")
                    )
                  )
                )
              ),
              codeContentType = Some("ZIPFILE")
            )
          )
        )
      ),
      serviceExecutionRole = Some("arn:example-role"),
      runtimeEnvironment = Some("FLINK-1_13")
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
      ApplicationName: prefix-dev-app-name-us-east-1
      Tags:
        - Key: env
          Value: dev
        - Key: region
          Value: us-east-1
    Metadata:
      aws:cdk:path: ExampleStack/Runtime
```

# Limitations

- Builders which use overloading for optional parameters (same name but different types)
are represented as `paramName0`, `paramName1`, etc..

# Acknowledgements

- Inspired by [AWS CDK Kotlin DSL](https://github.com/Semantic-Configuration/AWS-CDK-Kotlin-DSL).
