package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TriggerConfigProperty {

  def apply(
    triggerType: String,
    triggerProperties: Option[software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty.Builder)
      .triggerType(triggerType)
      .triggerProperties(triggerProperties.orNull)
      .build()
}
