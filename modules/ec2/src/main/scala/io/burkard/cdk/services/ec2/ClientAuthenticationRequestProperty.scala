package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientAuthenticationRequestProperty {

  def apply(
    federatedAuthentication: Option[software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty] = None,
    `type`: Option[String] = None,
    mutualAuthentication: Option[software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty] = None,
    activeDirectory: Option[software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.Builder)
      .federatedAuthentication(federatedAuthentication.orNull)
      .`type`(`type`.orNull)
      .mutualAuthentication(mutualAuthentication.orNull)
      .activeDirectory(activeDirectory.orNull)
      .build()
}
