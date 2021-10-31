package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomainName {

  def apply(
    internalResourceId: String,
    regionalCertificateArn: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainName: Option[String] = None,
    certificateArn: Option[String] = None,
    mutualTlsAuthentication: Option[software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty] = None,
    ownershipVerificationCertificateArn: Option[String] = None,
    endpointConfiguration: Option[software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty] = None,
    securityPolicy: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnDomainName =
    software.amazon.awscdk.services.apigateway.CfnDomainName.Builder
      .create(stackCtx, internalResourceId)
      .regionalCertificateArn(regionalCertificateArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .certificateArn(certificateArn.orNull)
      .mutualTlsAuthentication(mutualTlsAuthentication.orNull)
      .ownershipVerificationCertificateArn(ownershipVerificationCertificateArn.orNull)
      .endpointConfiguration(endpointConfiguration.orNull)
      .securityPolicy(securityPolicy.orNull)
      .build()
}
