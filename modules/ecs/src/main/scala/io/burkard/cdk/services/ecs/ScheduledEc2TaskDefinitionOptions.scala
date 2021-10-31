package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledEc2TaskDefinitionOptions {

  def apply(
    taskDefinition: Option[software.amazon.awscdk.services.ecs.Ec2TaskDefinition] = None
  ): software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions =
    (new software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions.Builder)
      .taskDefinition(taskDefinition.orNull)
      .build()
}
