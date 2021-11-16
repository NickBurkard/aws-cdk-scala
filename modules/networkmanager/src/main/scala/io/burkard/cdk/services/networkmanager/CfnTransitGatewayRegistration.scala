package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRegistration {

  def apply(
    internalResourceId: String,
    transitGatewayArn: String,
    globalNetworkId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration =
    software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration.Builder
      .create(stackCtx, internalResourceId)
      .transitGatewayArn(transitGatewayArn)
      .globalNetworkId(globalNetworkId)
      .build()
}
