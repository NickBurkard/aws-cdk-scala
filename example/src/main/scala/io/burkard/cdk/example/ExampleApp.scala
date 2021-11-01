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
