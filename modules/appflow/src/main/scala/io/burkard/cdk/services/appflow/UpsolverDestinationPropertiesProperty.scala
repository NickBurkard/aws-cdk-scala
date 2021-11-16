package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UpsolverDestinationPropertiesProperty {

  def apply(
    s3OutputFormatConfig: software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty,
    bucketName: String,
    bucketPrefix: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty.Builder)
      .s3OutputFormatConfig(s3OutputFormatConfig)
      .bucketName(bucketName)
      .bucketPrefix(bucketPrefix.orNull)
      .build()
}
