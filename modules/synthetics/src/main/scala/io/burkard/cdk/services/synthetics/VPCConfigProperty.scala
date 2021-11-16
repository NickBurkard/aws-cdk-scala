package io.burkard.cdk.services.synthetics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VPCConfigProperty {

  def apply(
    subnetIds: List[String],
    securityGroupIds: List[String],
    vpcId: Option[String] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty.Builder)
      .subnetIds(subnetIds.asJava)
      .securityGroupIds(securityGroupIds.asJava)
      .vpcId(vpcId.orNull)
      .build()
}
