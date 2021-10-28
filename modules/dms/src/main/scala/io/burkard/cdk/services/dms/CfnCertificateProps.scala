package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCertificateProps {

  def apply(
    certificateIdentifier: Option[String] = None,
    certificateWallet: Option[String] = None,
    certificatePem: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnCertificateProps =
    (new software.amazon.awscdk.services.dms.CfnCertificateProps.Builder)
      .certificateIdentifier(certificateIdentifier.orNull)
      .certificateWallet(certificateWallet.orNull)
      .certificatePem(certificatePem.orNull)
      .build()
}