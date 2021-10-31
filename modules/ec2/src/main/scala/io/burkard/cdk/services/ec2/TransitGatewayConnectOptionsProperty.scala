package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransitGatewayConnectOptionsProperty {

  def apply(
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.Builder)
      .protocol(protocol.orNull)
      .build()
}
