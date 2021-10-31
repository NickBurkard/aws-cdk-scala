# aws-cdk-scala

Scala DSL for [AWS CDK v2](https://docs.aws.amazon.com/cdk/latest/guide/work-with-cdk-v2.html).

### Purpose

- Pass around app & stack [scope](https://docs.aws.amazon.com/cdk/latest/guide/constructs.html) implicitly.
- Avoid using Java concepts.
  * No `Builder` syntax.
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

### Requirements

For synthesizing CloudFormation templates, you must install v2 of the CDK CLI.

```bash
# Note `@next`, this installs v2.
npm install -g aws-cdk@next
```

### Installation

I need to actually publish these artifacts first.

Please refer to [mvn](https://mvnrepository.com/artifact/software.amazon.awscdk/aws-cdk-lib)
for the actual version number of `aws-cdk-lib`.

```scala
val cdkLibVersion = "2.0.0-rc.27"
val dslVersion = "0.1.0"
val cdkVersion = s"$cdkLibVersion-$dslVersion"

libraryDependencies ++= Seq(
  "io.burkard" %% "aws-scala-cdk-core" % cdkVersion,
  "io.burkard" %% "aws-scala-cdk-s3" % cdkVersion
)
```

### Example

#### Scala

Create a CDK app in some sbt module.

```scala
import io.burkard.cdk._
import io.burkard.cdk.services.s3._

object ExampleApp extends App {
  val exampleStack: Stack = Stack(id = Some("example-stack")) { implicit stackCtx =>
    Bucket(
      internalResourceId = "my-bucket",
      accessControl = Some(BucketAccessControl.Private),
      enforceSsl = Some(true),
      encryption = Some(BucketEncryption.S3Managed),
      versioned = Some(true)
    )
  }
}
```

#### CDK

Create a `cdk.json` file at the root of your sbt project.

```json
{
  "app": "sbt \"example/runMain io.burkard.cdk.example.ExampleApp\""
}
```

Synthesize the application into YAML.

```bash
cdk synth
```

The result is a synthesized CloudFormation template.

```yaml
Resources:
  mybucket15D133BF:
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
      aws:cdk:path: example-stack/my-bucket/Resource
  mybucketPolicy4F66A877:
    Type: AWS::S3::BucketPolicy
    Properties:
      Bucket:
        Ref: mybucket15D133BF
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
                  - mybucket15D133BF
                  - Arn
              - Fn::Join:
                  - ""
                  - - Fn::GetAtt:
                        - mybucket15D133BF
                        - Arn
                    - /*
        Version: "2012-10-17"
```

### Limitations

- Builders which use overloading for optional parameters (same name but different types)
are represented as `paramName0`, `paramName1`, etc..

### Updates

When a new version of the CDK is published by AWS:

1. Create a new branch for the new CDK version.
2. Update the CDK version in `project/Dependencies.scala`.
3. Run `Codegen.scala` in the `codegen` module.
4. Add any new files & commit changes.
5. Open a PR & merge after approved.

### Thanks

- Inspired by [AWS CDK Kotlin DSL](https://github.com/Semantic-Configuration/AWS-CDK-Kotlin-DSL).
