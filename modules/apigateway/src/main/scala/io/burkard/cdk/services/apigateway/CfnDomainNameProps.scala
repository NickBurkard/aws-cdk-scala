package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDomainNameProps {

  def apply(
    regionalCertificateArn: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainName: Option[String] = None,
    certificateArn: Option[String] = None,
    mutualTlsAuthentication: Option[software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty] = None,
    ownershipVerificationCertificateArn: Option[String] = None,
    endpointConfiguration: Option[software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty] = None,
    securityPolicy: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnDomainNameProps =
    (new software.amazon.awscdk.services.apigateway.CfnDomainNameProps.Builder)
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
