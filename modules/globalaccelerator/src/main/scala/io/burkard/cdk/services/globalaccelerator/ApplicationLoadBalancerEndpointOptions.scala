package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationLoadBalancerEndpointOptions {

  def apply(
    weight: Option[Number] = None,
    preserveClientIp: Option[Boolean] = None
  ): software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpointOptions =
    (new software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpointOptions.Builder)
      .weight(weight.orNull)
      .preserveClientIp(preserveClientIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}