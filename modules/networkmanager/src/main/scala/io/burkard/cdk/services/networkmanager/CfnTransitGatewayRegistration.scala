package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRegistration {

  def apply(
    internalResourceId: String,
    transitGatewayArn: Option[String] = None,
    globalNetworkId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration =
    software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration.Builder
      .create(stackCtx, internalResourceId)
      .transitGatewayArn(transitGatewayArn.orNull)
      .globalNetworkId(globalNetworkId.orNull)
      .build()
}
