package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkLoadBalancerEndpointProps {

  def apply(
    weight: Option[Number] = None
  ): software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps =
    (new software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps.Builder)
      .weight(weight.orNull)
      .build()
}
