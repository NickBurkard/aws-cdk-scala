package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScheduledFargateTaskDefinitionOptions {

  def apply(
    taskDefinition: Option[software.amazon.awscdk.services.ecs.FargateTaskDefinition] = None
  ): software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions =
    (new software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions.Builder)
      .taskDefinition(taskDefinition.orNull)
      .build()
}
