package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TransitGatewayConnectOptionsProperty {

  def apply(
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.Builder)
      .protocol(protocol.orNull)
      .build()
}
