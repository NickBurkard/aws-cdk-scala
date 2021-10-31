package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayMulticastGroupSource {

  def apply(
    internalResourceId: String,
    groupIpAddress: Option[String] = None,
    transitGatewayMulticastDomainId: Option[String] = None,
    networkInterfaceId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource.Builder
      .create(stackCtx, internalResourceId)
      .groupIpAddress(groupIpAddress.orNull)
      .transitGatewayMulticastDomainId(transitGatewayMulticastDomainId.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}
