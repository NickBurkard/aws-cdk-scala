package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRegistrationProps {

  def apply(
    transitGatewayArn: String,
    globalNetworkId: String
  ): software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps =
    (new software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps.Builder)
      .transitGatewayArn(transitGatewayArn)
      .globalNetworkId(globalNetworkId)
      .build()
}
