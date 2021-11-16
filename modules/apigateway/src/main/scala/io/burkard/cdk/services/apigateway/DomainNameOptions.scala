package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainNameOptions {

  def apply(
    certificate: software.amazon.awscdk.services.certificatemanager.ICertificate,
    domainName: String,
    mtls: Option[software.amazon.awscdk.services.apigateway.MTLSConfig] = None,
    endpointType: Option[software.amazon.awscdk.services.apigateway.EndpointType] = None,
    securityPolicy: Option[software.amazon.awscdk.services.apigateway.SecurityPolicy] = None
  ): software.amazon.awscdk.services.apigateway.DomainNameOptions =
    (new software.amazon.awscdk.services.apigateway.DomainNameOptions.Builder)
      .certificate(certificate)
      .domainName(domainName)
      .mtls(mtls.orNull)
      .endpointType(endpointType.orNull)
      .securityPolicy(securityPolicy.orNull)
      .build()
}
