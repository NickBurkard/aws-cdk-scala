package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RevocationConfigurationProperty {

  def apply(
    crlConfiguration: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty] = None,
    ocspConfiguration: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty.Builder)
      .crlConfiguration(crlConfiguration.orNull)
      .ocspConfiguration(ocspConfiguration.orNull)
      .build()
}
