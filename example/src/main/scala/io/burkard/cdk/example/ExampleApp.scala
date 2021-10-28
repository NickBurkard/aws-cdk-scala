package io.burkard.cdk.example

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
