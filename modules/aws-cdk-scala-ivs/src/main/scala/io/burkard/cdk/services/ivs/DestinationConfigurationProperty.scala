package io.burkard.cdk.services.ivs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DestinationConfigurationProperty {

  def apply(
    s3: Option[software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty] = None
  ): software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty =
    (new software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty.Builder)
      .s3(s3.orNull)
      .build()
}
