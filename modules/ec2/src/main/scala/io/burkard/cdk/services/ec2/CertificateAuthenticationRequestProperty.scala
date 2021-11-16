package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CertificateAuthenticationRequestProperty {

  def apply(
    clientRootCertificateChainArn: String
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.Builder)
      .clientRootCertificateChainArn(clientRootCertificateChainArn)
      .build()
}
