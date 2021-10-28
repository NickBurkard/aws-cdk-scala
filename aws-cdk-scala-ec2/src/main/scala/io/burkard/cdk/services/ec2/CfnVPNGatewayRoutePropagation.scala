package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPNGatewayRoutePropagation {

  def apply(
    internalResourceId: String,
    vpnGatewayId: Option[String] = None,
    routeTableIds: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation =
    software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation.Builder
      .create(stackCtx, internalResourceId)
      .vpnGatewayId(vpnGatewayId.orNull)
      .routeTableIds(routeTableIds.map(_.asJava).orNull)
      .build()
}
