package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubnetSelection {

  def apply(
    subnets: Option[List[_ <: software.amazon.awscdk.services.ec2.ISubnet]] = None,
    onePerAz: Option[Boolean] = None,
    subnetGroupName: Option[String] = None,
    subnetFilters: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetFilter]] = None,
    subnetType: Option[software.amazon.awscdk.services.ec2.SubnetType] = None,
    availabilityZones: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.SubnetSelection =
    (new software.amazon.awscdk.services.ec2.SubnetSelection.Builder)
      .subnets(subnets.map(_.asJava).orNull)
      .onePerAz(onePerAz.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .subnetGroupName(subnetGroupName.orNull)
      .subnetFilters(subnetFilters.map(_.asJava).orNull)
      .subnetType(subnetType.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .build()
}
