package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessMethodProperty {

  def apply(
    accessMethodType: Option[String] = None,
    customObjectIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty.Builder)
      .accessMethodType(accessMethodType.orNull)
      .customObjectIdentifier(customObjectIdentifier.orNull)
      .build()
}
