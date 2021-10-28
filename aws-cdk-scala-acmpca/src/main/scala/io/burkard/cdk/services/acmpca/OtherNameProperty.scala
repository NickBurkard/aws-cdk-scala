package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OtherNameProperty {

  def apply(
    typeId: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty.Builder)
      .typeId(typeId.orNull)
      .value(value.orNull)
      .build()
}
