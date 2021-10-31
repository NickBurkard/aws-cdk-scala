package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3SourcePropertiesProperty {

  def apply(
    bucketPrefix: Option[String] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty.Builder)
      .bucketPrefix(bucketPrefix.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
