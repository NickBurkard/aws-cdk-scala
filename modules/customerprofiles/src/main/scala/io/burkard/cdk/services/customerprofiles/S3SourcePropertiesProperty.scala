package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3SourcePropertiesProperty {

  def apply(
    bucketName: String,
    bucketPrefix: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty.Builder)
      .bucketName(bucketName)
      .bucketPrefix(bucketPrefix.orNull)
      .build()
}
