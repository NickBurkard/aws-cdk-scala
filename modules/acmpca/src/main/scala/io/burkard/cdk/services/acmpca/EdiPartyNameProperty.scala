package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EdiPartyNameProperty {

  def apply(
    partyName: Option[String] = None,
    nameAssigner: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty.Builder)
      .partyName(partyName.orNull)
      .nameAssigner(nameAssigner.orNull)
      .build()
}
