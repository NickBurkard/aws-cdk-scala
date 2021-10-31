package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainNameProps {

  def apply(
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None,
    mapping: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None,
    domainName: Option[String] = None,
    mtls: Option[software.amazon.awscdk.services.apigateway.MTLSConfig] = None,
    endpointType: Option[software.amazon.awscdk.services.apigateway.EndpointType] = None,
    securityPolicy: Option[software.amazon.awscdk.services.apigateway.SecurityPolicy] = None
  ): software.amazon.awscdk.services.apigateway.DomainNameProps =
    (new software.amazon.awscdk.services.apigateway.DomainNameProps.Builder)
      .certificate(certificate.orNull)
      .mapping(mapping.orNull)
      .domainName(domainName.orNull)
      .mtls(mtls.orNull)
      .endpointType(endpointType.orNull)
      .securityPolicy(securityPolicy.orNull)
      .build()
}
