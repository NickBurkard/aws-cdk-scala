# aws-cdk-scala

Scala DSL for [AWS CDK v2](https://docs.aws.amazon.com/cdk/latest/guide/work-with-cdk-v2.html).

### Purpose

- Pass around app & stack [scope](https://docs.aws.amazon.com/cdk/latest/guide/constructs.html) implicitly.
- Avoid using Java concepts.
  * No `Builder` syntax.
  * ADTs instead of enums.
  * Scala collections (i.e. `List` & `Map`).

### Import

I need to actually publish these artifacts first.

Please refer to [mvn](https://mvnrepository.com/artifact/software.amazon.awscdk/aws-cdk-lib)
for the actual version number of `aws-cdk-lib`.

```scala
val cdkVersion = "2.0.0-rc.27-0.1.0"

libraryDependencies ++= Seq(
  "io.burkard" %% "aws-scala-cdk-core" % cdkVersion,
  "io.burkard" %% "aws-scala-cdk-s3" % cdkVersion
)
```

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
