package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubnetAttributes {

  def apply(
    routeTableId: Option[String] = None,
    ipv4CidrBlock: Option[String] = None,
    availabilityZone: Option[String] = None,
    subnetId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.SubnetAttributes =
    (new software.amazon.awscdk.services.ec2.SubnetAttributes.Builder)
      .routeTableId(routeTableId.orNull)
      .ipv4CidrBlock(ipv4CidrBlock.orNull)
      .availabilityZone(availabilityZone.orNull)
      .subnetId(subnetId.orNull)
      .build()
}
