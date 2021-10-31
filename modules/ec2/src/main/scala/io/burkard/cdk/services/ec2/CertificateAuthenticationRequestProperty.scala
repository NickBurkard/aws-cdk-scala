package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CertificateAuthenticationRequestProperty {

  def apply(
    clientRootCertificateChainArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.Builder)
      .clientRootCertificateChainArn(clientRootCertificateChainArn.orNull)
      .build()
}
