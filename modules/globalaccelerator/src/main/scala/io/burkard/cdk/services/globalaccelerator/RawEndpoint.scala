package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RawEndpoint {

  def apply(
    endpointId: String,
    weight: Option[Number] = None,
    preserveClientIp: Option[Boolean] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.globalaccelerator.RawEndpoint =
    software.amazon.awscdk.services.globalaccelerator.RawEndpoint.Builder
      .create()
      .endpointId(endpointId)
      .weight(weight.orNull)
      .preserveClientIp(preserveClientIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .region(region.orNull)
      .build()
}
