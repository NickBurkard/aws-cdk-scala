package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPNConnectionRoute {

  def apply(
    internalResourceId: String,
    vpnConnectionId: Option[String] = None,
    destinationCidrBlock: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute =
    software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute.Builder
      .create(stackCtx, internalResourceId)
      .vpnConnectionId(vpnConnectionId.orNull)
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .build()
}
