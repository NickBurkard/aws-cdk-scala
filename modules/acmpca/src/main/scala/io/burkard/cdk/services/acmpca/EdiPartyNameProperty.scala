package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EdiPartyNameProperty {

  def apply(
    partyName: Option[String] = None,
    nameAssigner: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty.Builder)
      .partyName(partyName.orNull)
      .nameAssigner(nameAssigner.orNull)
      .build()
}
