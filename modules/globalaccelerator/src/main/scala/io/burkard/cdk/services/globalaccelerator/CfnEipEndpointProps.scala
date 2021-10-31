package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEipEndpointProps {

  def apply(
    weight: Option[Number] = None
  ): software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpointProps =
    (new software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpointProps.Builder)
      .weight(weight.orNull)
      .build()
}
