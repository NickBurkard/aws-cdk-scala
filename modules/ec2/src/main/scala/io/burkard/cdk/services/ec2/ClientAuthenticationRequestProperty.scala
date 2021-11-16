package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientAuthenticationRequestProperty {

  def apply(
    `type`: String,
    federatedAuthentication: Option[software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty] = None,
    mutualAuthentication: Option[software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty] = None,
    activeDirectory: Option[software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.Builder)
      .`type`(`type`)
      .federatedAuthentication(federatedAuthentication.orNull)
      .mutualAuthentication(mutualAuthentication.orNull)
      .activeDirectory(activeDirectory.orNull)
      .build()
}
