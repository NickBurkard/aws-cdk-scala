package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
