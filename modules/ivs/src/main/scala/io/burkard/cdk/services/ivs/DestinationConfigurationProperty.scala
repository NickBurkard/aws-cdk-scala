package io.burkard.cdk.services.ivs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationConfigurationProperty {

  def apply(
    s3: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty
  ): software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty =
    (new software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty.Builder)
      .s3(s3)
      .build()
}
