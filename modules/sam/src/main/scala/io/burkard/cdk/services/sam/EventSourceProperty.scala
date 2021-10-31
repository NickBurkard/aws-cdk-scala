package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventSourceProperty {

  def apply(
    properties0: Option[software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty] = None,
    properties1: Option[software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty] = None,
    properties2: Option[software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty] = None,
    properties3: Option[software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty.Builder)
      .properties(properties0.orNull)
      .properties(properties1.orNull)
      .properties(properties2.orNull)
      .properties(properties3.orNull)
      .`type`(`type`.orNull)
      .build()
}
