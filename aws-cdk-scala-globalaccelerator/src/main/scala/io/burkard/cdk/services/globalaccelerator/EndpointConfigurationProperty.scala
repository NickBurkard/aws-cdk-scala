package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EndpointConfigurationProperty {

  def apply(
    weight: Option[Number] = None,
    endpointId: Option[String] = None,
    clientIpPreservationEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty =
    (new software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty.Builder)
      .weight(weight.orNull)
      .endpointId(endpointId.orNull)
      .clientIpPreservationEnabled(clientIpPreservationEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
