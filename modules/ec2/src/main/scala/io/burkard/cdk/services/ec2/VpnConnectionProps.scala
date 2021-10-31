package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpnConnectionProps {

  def apply(
    ip: Option[String] = None,
    staticRoutes: Option[List[String]] = None,
    tunnelOptions: Option[List[_ <: software.amazon.awscdk.services.ec2.VpnTunnelOption]] = None,
    asn: Option[Number] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.ec2.VpnConnectionProps =
    (new software.amazon.awscdk.services.ec2.VpnConnectionProps.Builder)
      .ip(ip.orNull)
      .staticRoutes(staticRoutes.map(_.asJava).orNull)
      .tunnelOptions(tunnelOptions.map(_.asJava).orNull)
      .asn(asn.orNull)
      .vpc(vpc.orNull)
      .build()
}
