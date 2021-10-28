package io.burkard.cdk.services.signer

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SignatureValidityPeriodProperty {

  def apply(
    `type`: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty =
    (new software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty.Builder)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
