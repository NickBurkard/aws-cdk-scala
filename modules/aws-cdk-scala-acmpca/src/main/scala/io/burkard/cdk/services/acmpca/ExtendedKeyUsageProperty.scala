package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExtendedKeyUsageProperty {

  def apply(
    extendedKeyUsageType: Option[String] = None,
    extendedKeyUsageObjectIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty.Builder)
      .extendedKeyUsageType(extendedKeyUsageType.orNull)
      .extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier.orNull)
      .build()
}
