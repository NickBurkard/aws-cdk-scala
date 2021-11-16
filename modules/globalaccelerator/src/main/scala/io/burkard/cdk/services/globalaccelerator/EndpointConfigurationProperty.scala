package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndpointConfigurationProperty {

  def apply(
    endpointId: String,
    weight: Option[Number] = None,
    clientIpPreservationEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty =
    (new software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty.Builder)
      .endpointId(endpointId)
      .weight(weight.orNull)
      .clientIpPreservationEnabled(clientIpPreservationEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
