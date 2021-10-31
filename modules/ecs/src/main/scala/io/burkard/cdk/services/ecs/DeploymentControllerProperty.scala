package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeploymentControllerProperty {

  def apply(
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty.Builder)
      .`type`(`type`.orNull)
      .build()
}
