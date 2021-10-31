package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetRouteTableAssociation {

  def apply(
    internalResourceId: String,
    routeTableId: Option[String] = None,
    subnetId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation =
    software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation.Builder
      .create(stackCtx, internalResourceId)
      .routeTableId(routeTableId.orNull)
      .subnetId(subnetId.orNull)
      .build()
}
