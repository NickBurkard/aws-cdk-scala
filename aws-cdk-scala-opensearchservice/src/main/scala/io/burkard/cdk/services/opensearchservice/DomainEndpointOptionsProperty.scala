package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DomainEndpointOptionsProperty {

  def apply(
    tlsSecurityPolicy: Option[String] = None,
    customEndpointCertificateArn: Option[String] = None,
    customEndpoint: Option[String] = None,
    customEndpointEnabled: Option[Boolean] = None,
    enforceHttps: Option[Boolean] = None
  ): software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty =
    (new software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty.Builder)
      .tlsSecurityPolicy(tlsSecurityPolicy.orNull)
      .customEndpointCertificateArn(customEndpointCertificateArn.orNull)
      .customEndpoint(customEndpoint.orNull)
      .customEndpointEnabled(customEndpointEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enforceHttps(enforceHttps.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
