package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpnConnectionOptions {

  def apply(
    ip: Option[String] = None,
    staticRoutes: Option[List[String]] = None,
    tunnelOptions: Option[List[_ <: software.amazon.awscdk.services.ec2.VpnTunnelOption]] = None,
    asn: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.VpnConnectionOptions =
    (new software.amazon.awscdk.services.ec2.VpnConnectionOptions.Builder)
      .ip(ip.orNull)
      .staticRoutes(staticRoutes.map(_.asJava).orNull)
      .tunnelOptions(tunnelOptions.map(_.asJava).orNull)
      .asn(asn.orNull)
      .build()
}
