package io.burkard.cdk.cxapi

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcSubnetGroup {

  def apply(
    subnets: Option[List[_ <: software.amazon.awscdk.cxapi.VpcSubnet]] = None,
    name: Option[String] = None,
    `type`: Option[software.amazon.awscdk.cxapi.VpcSubnetGroupType] = None
  ): software.amazon.awscdk.cxapi.VpcSubnetGroup =
    (new software.amazon.awscdk.cxapi.VpcSubnetGroup.Builder)
      .subnets(subnets.map(_.asJava).orNull)
      .name(name.orNull)
      .`type`(`type`.orNull)
      .build()
}
