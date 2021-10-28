package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSubnetRouteTableAssociationProps {

  def apply(
    routeTableId: Option[String] = None,
    subnetId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps.Builder)
      .routeTableId(routeTableId.orNull)
      .subnetId(subnetId.orNull)
      .build()
}
