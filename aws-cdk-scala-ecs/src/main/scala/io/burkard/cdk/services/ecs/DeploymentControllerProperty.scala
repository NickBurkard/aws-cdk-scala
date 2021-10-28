package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeploymentControllerProperty {

  def apply(
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty.Builder)
      .`type`(`type`.orNull)
      .build()
}
