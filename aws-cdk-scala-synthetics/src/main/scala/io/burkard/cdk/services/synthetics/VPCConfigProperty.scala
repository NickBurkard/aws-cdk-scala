package io.burkard.cdk.services.synthetics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VPCConfigProperty {

  def apply(
    subnetIds: Option[List[String]] = None,
    vpcId: Option[String] = None,
    securityGroupIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .vpcId(vpcId.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}
