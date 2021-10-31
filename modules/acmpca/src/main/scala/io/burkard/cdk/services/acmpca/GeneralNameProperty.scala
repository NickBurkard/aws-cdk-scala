package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GeneralNameProperty {

  def apply(
    ediPartyName: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty] = None,
    uniformResourceIdentifier: Option[String] = None,
    directoryName: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty] = None,
    otherName: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty] = None,
    rfc822Name: Option[String] = None,
    registeredId: Option[String] = None,
    ipAddress: Option[String] = None,
    dnsName: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty.Builder)
      .ediPartyName(ediPartyName.orNull)
      .uniformResourceIdentifier(uniformResourceIdentifier.orNull)
      .directoryName(directoryName.orNull)
      .otherName(otherName.orNull)
      .rfc822Name(rfc822Name.orNull)
      .registeredId(registeredId.orNull)
      .ipAddress(ipAddress.orNull)
      .dnsName(dnsName.orNull)
      .build()
}
