package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRegistrationProps {

  def apply(
    transitGatewayArn: Option[String] = None,
    globalNetworkId: Option[String] = None
  ): software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps =
    (new software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps.Builder)
      .transitGatewayArn(transitGatewayArn.orNull)
      .globalNetworkId(globalNetworkId.orNull)
      .build()
}
