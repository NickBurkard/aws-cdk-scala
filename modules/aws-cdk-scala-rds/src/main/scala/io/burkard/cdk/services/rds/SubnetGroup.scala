package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubnetGroup {

  def apply(
    internalResourceId: String,
    subnetGroupName: Option[String] = None,
    description: Option[String] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.SubnetGroup =
    software.amazon.awscdk.services.rds.SubnetGroup.Builder
      .create(stackCtx, internalResourceId)
      .subnetGroupName(subnetGroupName.orNull)
      .description(description.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .vpc(vpc.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
