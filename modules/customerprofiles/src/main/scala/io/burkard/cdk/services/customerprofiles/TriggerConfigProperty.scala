package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TriggerConfigProperty {

  def apply(
    triggerType: String,
    triggerProperties: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty.Builder)
      .triggerType(triggerType)
      .triggerProperties(triggerProperties.orNull)
      .build()
}
