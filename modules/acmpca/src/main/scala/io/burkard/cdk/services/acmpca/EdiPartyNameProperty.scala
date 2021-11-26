package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EdiPartyNameProperty {

  def apply(
    partyName: String,
    nameAssigner: String
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty.Builder)
      .partyName(partyName)
      .nameAssigner(nameAssigner)
      .build()
}
