package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificate {

  def apply(
    internalResourceId: String,
    certificateIdentifier: Option[String] = None,
    certificateWallet: Option[String] = None,
    certificatePem: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.dms.CfnCertificate =
    software.amazon.awscdk.services.dms.CfnCertificate.Builder
      .create(stackCtx, internalResourceId)
      .certificateIdentifier(certificateIdentifier.orNull)
      .certificateWallet(certificateWallet.orNull)
      .certificatePem(certificatePem.orNull)
      .build()
}
