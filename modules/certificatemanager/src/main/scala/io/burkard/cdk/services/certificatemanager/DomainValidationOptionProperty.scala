package io.burkard.cdk.services.certificatemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainValidationOptionProperty {

  def apply(
    validationDomain: Option[String] = None,
    hostedZoneId: Option[String] = None,
    domainName: Option[String] = None
  ): software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty =
    (new software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.Builder)
      .validationDomain(validationDomain.orNull)
      .hostedZoneId(hostedZoneId.orNull)
      .domainName(domainName.orNull)
      .build()
}
