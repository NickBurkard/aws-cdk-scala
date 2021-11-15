package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyUsageProperty {

  def apply(
    keyAgreement: Option[Boolean] = None,
    nonRepudiation: Option[Boolean] = None,
    decipherOnly: Option[Boolean] = None,
    digitalSignature: Option[Boolean] = None,
    encipherOnly: Option[Boolean] = None,
    keyEncipherment: Option[Boolean] = None,
    crlSign: Option[Boolean] = None,
    keyCertSign: Option[Boolean] = None,
    dataEncipherment: Option[Boolean] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty.Builder)
      .keyAgreement(keyAgreement.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .nonRepudiation(nonRepudiation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .decipherOnly(decipherOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .digitalSignature(digitalSignature.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encipherOnly(encipherOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .keyEncipherment(keyEncipherment.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .crlSign(crlSign.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .keyCertSign(keyCertSign.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dataEncipherment(dataEncipherment.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
