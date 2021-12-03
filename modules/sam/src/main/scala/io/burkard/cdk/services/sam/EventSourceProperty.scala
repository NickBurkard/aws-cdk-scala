package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventSourceProperty {

  def apply(
    properties0: software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty,
    properties1: software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty,
    properties2: software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty,
    properties3: software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty,
    `type`: String
  ): software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty.Builder)
      .properties(properties0)
      .properties(properties1)
      .properties(properties2)
      .properties(properties3)
      .`type`(`type`)
      .build()
}
