package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEipEndpointProps {

  def apply(
    weight: Option[Number] = None
  ): software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpointProps =
    (new software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpointProps.Builder)
      .weight(weight.orNull)
      .build()
}
