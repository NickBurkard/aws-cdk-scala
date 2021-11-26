package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OtherNameProperty {

  def apply(
    typeId: String,
    value: String
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty.Builder)
      .typeId(typeId)
      .value(value)
      .build()
}
