package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPNConnectionRouteProps {

  def apply(
    vpnConnectionId: String,
    destinationCidrBlock: String
  ): software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps =
    (new software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps.Builder)
      .vpnConnectionId(vpnConnectionId)
      .destinationCidrBlock(destinationCidrBlock)
      .build()
}
