package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPNGatewayRoutePropagation {

  def apply(
    internalResourceId: String,
    vpnGatewayId: String,
    routeTableIds: List[String]
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation =
    software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation.Builder
      .create(stackCtx, internalResourceId)
      .vpnGatewayId(vpnGatewayId)
      .routeTableIds(routeTableIds.asJava)
      .build()
}
