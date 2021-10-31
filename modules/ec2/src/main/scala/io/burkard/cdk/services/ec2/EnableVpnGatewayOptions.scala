package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EnableVpnGatewayOptions {

  def apply(
    vpnRoutePropagation: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None,
    amazonSideAsn: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions =
    (new software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions.Builder)
      .vpnRoutePropagation(vpnRoutePropagation.map(_.asJava).orNull)
      .amazonSideAsn(amazonSideAsn.orNull)
      .`type`(`type`.orNull)
      .build()
}
