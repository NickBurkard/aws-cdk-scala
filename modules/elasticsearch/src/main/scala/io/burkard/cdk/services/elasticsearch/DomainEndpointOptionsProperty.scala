package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainEndpointOptionsProperty {

  def apply(
    tlsSecurityPolicy: Option[String] = None,
    customEndpointCertificateArn: Option[String] = None,
    customEndpoint: Option[String] = None,
    customEndpointEnabled: Option[Boolean] = None,
    enforceHttps: Option[Boolean] = None
  ): software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty =
    (new software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty.Builder)
      .tlsSecurityPolicy(tlsSecurityPolicy.orNull)
      .customEndpointCertificateArn(customEndpointCertificateArn.orNull)
      .customEndpoint(customEndpoint.orNull)
      .customEndpointEnabled(customEndpointEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enforceHttps(enforceHttps.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
