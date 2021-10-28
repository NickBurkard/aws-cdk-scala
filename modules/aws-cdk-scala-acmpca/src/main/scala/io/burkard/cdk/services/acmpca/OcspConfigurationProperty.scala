package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OcspConfigurationProperty {

  def apply(
    ocspCustomCname: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty.Builder)
      .ocspCustomCname(ocspCustomCname.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
