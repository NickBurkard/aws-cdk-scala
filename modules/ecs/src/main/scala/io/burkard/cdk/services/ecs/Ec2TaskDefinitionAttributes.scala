package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ec2TaskDefinitionAttributes {

  def apply(
    taskDefinitionArn: Option[String] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    networkMode: Option[software.amazon.awscdk.services.ecs.NetworkMode] = None
  ): software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes =
    (new software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes.Builder)
      .taskDefinitionArn(taskDefinitionArn.orNull)
      .taskRole(taskRole.orNull)
      .networkMode(networkMode.orNull)
      .build()
}
