package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeploymentController {

  def apply(
    `type`: Option[software.amazon.awscdk.services.ecs.DeploymentControllerType] = None
  ): software.amazon.awscdk.services.ecs.DeploymentController =
    (new software.amazon.awscdk.services.ecs.DeploymentController.Builder)
      .`type`(`type`.orNull)
      .build()
}
