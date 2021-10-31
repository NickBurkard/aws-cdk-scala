package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExternalTaskDefinitionAttributes {

  def apply(
    taskDefinitionArn: Option[String] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    networkMode: Option[software.amazon.awscdk.services.ecs.NetworkMode] = None
  ): software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes =
    (new software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes.Builder)
      .taskDefinitionArn(taskDefinitionArn.orNull)
      .taskRole(taskRole.orNull)
      .networkMode(networkMode.orNull)
      .build()
}
