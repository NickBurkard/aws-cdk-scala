package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubjectProperty {

  def apply(
    organization: Option[String] = None,
    serialNumber: Option[String] = None,
    givenName: Option[String] = None,
    state: Option[String] = None,
    initials: Option[String] = None,
    commonName: Option[String] = None,
    country: Option[String] = None,
    pseudonym: Option[String] = None,
    generationQualifier: Option[String] = None,
    distinguishedNameQualifier: Option[String] = None,
    title: Option[String] = None,
    locality: Option[String] = None,
    surname: Option[String] = None,
    organizationalUnit: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty.Builder)
      .organization(organization.orNull)
      .serialNumber(serialNumber.orNull)
      .givenName(givenName.orNull)
      .state(state.orNull)
      .initials(initials.orNull)
      .commonName(commonName.orNull)
      .country(country.orNull)
      .pseudonym(pseudonym.orNull)
      .generationQualifier(generationQualifier.orNull)
      .distinguishedNameQualifier(distinguishedNameQualifier.orNull)
      .title(title.orNull)
      .locality(locality.orNull)
      .surname(surname.orNull)
      .organizationalUnit(organizationalUnit.orNull)
      .build()
}
