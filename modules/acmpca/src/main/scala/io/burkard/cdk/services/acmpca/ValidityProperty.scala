package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ValidityProperty {

  def apply(
    `type`: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty.Builder)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
