package io.burkard.cdk.services.ivs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3DestinationConfigurationProperty {

  def apply(
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty =
    (new software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty.Builder)
      .bucketName(bucketName.orNull)
      .build()
}
