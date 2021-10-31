package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
