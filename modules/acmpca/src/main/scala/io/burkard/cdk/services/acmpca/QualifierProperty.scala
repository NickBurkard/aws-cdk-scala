package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QualifierProperty {

  def apply(
    cpsUri: String
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty.Builder)
      .cpsUri(cpsUri)
      .build()
}
