package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubnetGroup {

  def apply(
    internalResourceId: String,
    description: String,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    subnetGroupName: Option[String] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.SubnetGroup =
    software.amazon.awscdk.services.rds.SubnetGroup.Builder
      .create(stackCtx, internalResourceId)
      .description(description)
      .vpc(vpc)
      .subnetGroupName(subnetGroupName.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
