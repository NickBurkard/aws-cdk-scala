package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetRouteTableAssociation {

  def apply(
    internalResourceId: String,
    routeTableId: String,
    subnetId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation =
    software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation.Builder
      .create(stackCtx, internalResourceId)
      .routeTableId(routeTableId)
      .subnetId(subnetId)
      .build()
}
