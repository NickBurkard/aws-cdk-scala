package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SelectedSubnets {

  def apply(
    hasPublic: Option[Boolean] = None,
    internetConnectivityEstablished: Option[software.constructs.IDependable] = None,
    availabilityZones: Option[List[String]] = None,
    subnetIds: Option[List[String]] = None,
    subnets: Option[List[_ <: software.amazon.awscdk.services.ec2.ISubnet]] = None
  ): software.amazon.awscdk.services.ec2.SelectedSubnets =
    (new software.amazon.awscdk.services.ec2.SelectedSubnets.Builder)
      .hasPublic(hasPublic.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .internetConnectivityEstablished(internetConnectivityEstablished.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .subnets(subnets.map(_.asJava).orNull)
      .build()
}