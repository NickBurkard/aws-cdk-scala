package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceEndpointProps {

  def apply(
    weight: Option[Number] = None,
    preserveClientIp: Option[Boolean] = None
  ): software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps =
    (new software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps.Builder)
      .weight(weight.orNull)
      .preserveClientIp(preserveClientIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
