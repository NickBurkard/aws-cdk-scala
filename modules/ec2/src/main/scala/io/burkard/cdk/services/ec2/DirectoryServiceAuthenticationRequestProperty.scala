package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DirectoryServiceAuthenticationRequestProperty {

  def apply(
    directoryId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.Builder)
      .directoryId(directoryId.orNull)
      .build()
}
