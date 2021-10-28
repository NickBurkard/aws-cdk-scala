package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EndpointDetailsProperty {

  def apply(
    securityDetails: Option[software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty] = None,
    endpoint: Option[software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty] = None
  ): software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty =
    (new software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty.Builder)
      .securityDetails(securityDetails.orNull)
      .endpoint(endpoint.orNull)
      .build()
}
