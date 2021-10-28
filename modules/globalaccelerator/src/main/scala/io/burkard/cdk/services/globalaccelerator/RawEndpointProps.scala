package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RawEndpointProps {

  def apply(
    weight: Option[Number] = None,
    preserveClientIp: Option[Boolean] = None,
    endpointId: Option[String] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.globalaccelerator.RawEndpointProps =
    (new software.amazon.awscdk.services.globalaccelerator.RawEndpointProps.Builder)
      .weight(weight.orNull)
      .preserveClientIp(preserveClientIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .endpointId(endpointId.orNull)
      .region(region.orNull)
      .build()
}
