package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigDataProperty {

  def apply(
    uplinkEchoConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty] = None,
    antennaDownlinkDemodDecodeConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty] = None,
    dataflowEndpointConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty] = None,
    antennaDownlinkConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty] = None,
    trackingConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty] = None,
    s3RecordingConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty] = None,
    antennaUplinkConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty.Builder)
      .uplinkEchoConfig(uplinkEchoConfig.orNull)
      .antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig.orNull)
      .dataflowEndpointConfig(dataflowEndpointConfig.orNull)
      .antennaDownlinkConfig(antennaDownlinkConfig.orNull)
      .trackingConfig(trackingConfig.orNull)
      .s3RecordingConfig(s3RecordingConfig.orNull)
      .antennaUplinkConfig(antennaUplinkConfig.orNull)
      .build()
}
