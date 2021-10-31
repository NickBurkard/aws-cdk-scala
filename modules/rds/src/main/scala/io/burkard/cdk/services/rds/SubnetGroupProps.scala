package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubnetGroupProps {

  def apply(
    subnetGroupName: Option[String] = None,
    description: Option[String] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.rds.SubnetGroupProps =
    (new software.amazon.awscdk.services.rds.SubnetGroupProps.Builder)
      .subnetGroupName(subnetGroupName.orNull)
      .description(description.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .vpc(vpc.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
