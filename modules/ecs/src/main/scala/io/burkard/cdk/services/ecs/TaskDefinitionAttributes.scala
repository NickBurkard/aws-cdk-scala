package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskDefinitionAttributes {

  def apply(
    taskDefinitionArn: Option[String] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    compatibility: Option[software.amazon.awscdk.services.ecs.Compatibility] = None,
    networkMode: Option[software.amazon.awscdk.services.ecs.NetworkMode] = None
  ): software.amazon.awscdk.services.ecs.TaskDefinitionAttributes =
    (new software.amazon.awscdk.services.ecs.TaskDefinitionAttributes.Builder)
      .taskDefinitionArn(taskDefinitionArn.orNull)
      .taskRole(taskRole.orNull)
      .compatibility(compatibility.orNull)
      .networkMode(networkMode.orNull)
      .build()
}
