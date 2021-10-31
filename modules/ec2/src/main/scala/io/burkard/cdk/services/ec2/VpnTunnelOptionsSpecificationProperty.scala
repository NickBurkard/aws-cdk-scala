package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpnTunnelOptionsSpecificationProperty {

  def apply(
    preSharedKey: Option[String] = None,
    tunnelInsideCidr: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.Builder)
      .preSharedKey(preSharedKey.orNull)
      .tunnelInsideCidr(tunnelInsideCidr.orNull)
      .build()
}
