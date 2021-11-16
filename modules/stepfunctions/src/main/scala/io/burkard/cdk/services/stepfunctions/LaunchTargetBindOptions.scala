package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTargetBindOptions {

  def apply(
    taskDefinition: software.amazon.awscdk.services.ecs.ITaskDefinition,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions =
    (new software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions.Builder)
      .taskDefinition(taskDefinition)
      .cluster(cluster.orNull)
      .build()
}
