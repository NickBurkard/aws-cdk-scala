package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpnConnectionProps {

  def apply(
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    ip: Option[String] = None,
    staticRoutes: Option[List[String]] = None,
    tunnelOptions: Option[List[_ <: software.amazon.awscdk.services.ec2.VpnTunnelOption]] = None,
    asn: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.VpnConnectionProps =
    (new software.amazon.awscdk.services.ec2.VpnConnectionProps.Builder)
      .vpc(vpc)
      .ip(ip.orNull)
      .staticRoutes(staticRoutes.map(_.asJava).orNull)
      .tunnelOptions(tunnelOptions.map(_.asJava).orNull)
      .asn(asn.orNull)
      .build()
}
