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
