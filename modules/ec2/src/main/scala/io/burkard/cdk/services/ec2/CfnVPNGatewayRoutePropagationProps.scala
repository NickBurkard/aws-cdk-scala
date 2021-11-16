package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPNGatewayRoutePropagationProps {

  def apply(
    vpnGatewayId: String,
    routeTableIds: List[String]
  ): software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps =
    (new software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps.Builder)
      .vpnGatewayId(vpnGatewayId)
      .routeTableIds(routeTableIds.asJava)
      .build()
}
