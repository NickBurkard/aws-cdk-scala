package io.burkard.cdk.services.certificatemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainValidationOptionProperty {

  def apply(
    domainName: String,
    validationDomain: Option[String] = None,
    hostedZoneId: Option[String] = None
  ): software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty =
    (new software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.Builder)
      .domainName(domainName)
      .validationDomain(validationDomain.orNull)
      .hostedZoneId(hostedZoneId.orNull)
      .build()
}
