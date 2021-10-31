package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TriggerConfigProperty {

  def apply(
    triggerProperties: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty] = None,
    triggerType: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty.Builder)
      .triggerProperties(triggerProperties.orNull)
      .triggerType(triggerType.orNull)
      .build()
}
