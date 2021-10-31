package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TriggerConfigProperty {

  def apply(
    triggerProperties: Option[software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty] = None,
    triggerType: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty.Builder)
      .triggerProperties(triggerProperties.orNull)
      .triggerType(triggerType.orNull)
      .build()
}
