package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DomainNameOptions {

  def apply(
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None,
    domainName: Option[String] = None,
    mtls: Option[software.amazon.awscdk.services.apigateway.MTLSConfig] = None,
    endpointType: Option[software.amazon.awscdk.services.apigateway.EndpointType] = None,
    securityPolicy: Option[software.amazon.awscdk.services.apigateway.SecurityPolicy] = None
  ): software.amazon.awscdk.services.apigateway.DomainNameOptions =
    (new software.amazon.awscdk.services.apigateway.DomainNameOptions.Builder)
      .certificate(certificate.orNull)
      .domainName(domainName.orNull)
      .mtls(mtls.orNull)
      .endpointType(endpointType.orNull)
      .securityPolicy(securityPolicy.orNull)
      .build()
}
