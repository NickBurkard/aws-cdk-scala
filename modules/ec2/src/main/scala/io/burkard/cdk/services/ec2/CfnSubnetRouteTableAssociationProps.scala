package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetRouteTableAssociationProps {

  def apply(
    routeTableId: String,
    subnetId: String
  ): software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps.Builder)
      .routeTableId(routeTableId)
      .subnetId(subnetId)
      .build()
}
