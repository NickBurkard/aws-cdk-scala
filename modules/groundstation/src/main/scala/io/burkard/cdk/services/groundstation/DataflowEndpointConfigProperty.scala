package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataflowEndpointConfigProperty {

  def apply(
    dataflowEndpointName: Option[String] = None,
    dataflowEndpointRegion: Option[String] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty.Builder)
      .dataflowEndpointName(dataflowEndpointName.orNull)
      .dataflowEndpointRegion(dataflowEndpointRegion.orNull)
      .build()
}
