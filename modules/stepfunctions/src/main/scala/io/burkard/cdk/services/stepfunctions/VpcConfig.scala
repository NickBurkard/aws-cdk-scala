package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcConfig {

  def apply(
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    subnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig.Builder)
      .vpc(vpc)
      .subnets(subnets.orNull)
      .build()
}
