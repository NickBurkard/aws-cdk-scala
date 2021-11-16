package io.burkard.cdk.cxapi

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcSubnetGroup {

  def apply(
    subnets: List[_ <: software.amazon.awscdk.cxapi.VpcSubnet],
    name: String,
    `type`: software.amazon.awscdk.cxapi.VpcSubnetGroupType
  ): software.amazon.awscdk.cxapi.VpcSubnetGroup =
    (new software.amazon.awscdk.cxapi.VpcSubnetGroup.Builder)
      .subnets(subnets.asJava)
      .name(name)
      .`type`(`type`)
      .build()
}
