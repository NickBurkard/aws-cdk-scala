# aws-cdk-scala

Scala DSL for [AWS CDK](https://github.com/aws/aws-cdk).

### Purpose

- Pass around app & stack context implicitly.
- Avoid using Java builder syntax & enums.

### Example

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

### Support

Only Scala 2.13 for now. Maybe 2.12 and 3.x later.
