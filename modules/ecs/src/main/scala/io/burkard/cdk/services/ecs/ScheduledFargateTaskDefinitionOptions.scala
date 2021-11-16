package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledFargateTaskDefinitionOptions {

  def apply(
    taskDefinition: software.amazon.awscdk.services.ecs.FargateTaskDefinition
  ): software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions =
    (new software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions.Builder)
      .taskDefinition(taskDefinition)
      .build()
}
