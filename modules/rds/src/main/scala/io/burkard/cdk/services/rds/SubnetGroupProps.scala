package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubnetGroupProps {

  def apply(
    description: String,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    subnetGroupName: Option[String] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.rds.SubnetGroupProps =
    (new software.amazon.awscdk.services.rds.SubnetGroupProps.Builder)
      .description(description)
      .vpc(vpc)
      .subnetGroupName(subnetGroupName.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
