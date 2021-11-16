package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessDescriptionProperty {

  def apply(
    accessMethod: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty,
    accessLocation: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty.Builder)
      .accessMethod(accessMethod)
      .accessLocation(accessLocation)
      .build()
}
