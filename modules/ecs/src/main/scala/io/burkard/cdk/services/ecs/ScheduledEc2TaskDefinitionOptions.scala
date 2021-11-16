package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledEc2TaskDefinitionOptions {

  def apply(
    taskDefinition: software.amazon.awscdk.services.ecs.Ec2TaskDefinition
  ): software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions =
    (new software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions.Builder)
      .taskDefinition(taskDefinition)
      .build()
}
