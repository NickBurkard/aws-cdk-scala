package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DomainNameConfigurationProperty {

  def apply(
    certificateName: Option[String] = None,
    certificateArn: Option[String] = None,
    ownershipVerificationCertificateArn: Option[String] = None,
    endpointType: Option[String] = None,
    securityPolicy: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty.Builder)
      .certificateName(certificateName.orNull)
      .certificateArn(certificateArn.orNull)
      .ownershipVerificationCertificateArn(ownershipVerificationCertificateArn.orNull)
      .endpointType(endpointType.orNull)
      .securityPolicy(securityPolicy.orNull)
      .build()
}
