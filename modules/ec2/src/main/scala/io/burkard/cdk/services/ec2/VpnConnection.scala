package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpnConnection {

  def apply(
    internalResourceId: String,
    ip: Option[String] = None,
    staticRoutes: Option[List[String]] = None,
    tunnelOptions: Option[List[_ <: software.amazon.awscdk.services.ec2.VpnTunnelOption]] = None,
    asn: Option[Number] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.VpnConnection =
    software.amazon.awscdk.services.ec2.VpnConnection.Builder
      .create(stackCtx, internalResourceId)
      .ip(ip.orNull)
      .staticRoutes(staticRoutes.map(_.asJava).orNull)
      .tunnelOptions(tunnelOptions.map(_.asJava).orNull)
      .asn(asn.orNull)
      .vpc(vpc.orNull)
      .build()
}
