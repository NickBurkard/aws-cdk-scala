package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcConfig {

  def apply(
    subnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig.Builder)
      .subnets(subnets.orNull)
      .vpc(vpc.orNull)
      .build()
}
