package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SelectedSubnets {

  def apply(
    hasPublic: Boolean,
    internetConnectivityEstablished: software.constructs.IDependable,
    availabilityZones: List[String],
    subnetIds: List[String],
    subnets: List[_ <: software.amazon.awscdk.services.ec2.ISubnet]
  ): software.amazon.awscdk.services.ec2.SelectedSubnets =
    (new software.amazon.awscdk.services.ec2.SelectedSubnets.Builder)
      .hasPublic(hasPublic)
      .internetConnectivityEstablished(internetConnectivityEstablished)
      .availabilityZones(availabilityZones.asJava)
      .subnetIds(subnetIds.asJava)
      .subnets(subnets.asJava)
      .build()
}
