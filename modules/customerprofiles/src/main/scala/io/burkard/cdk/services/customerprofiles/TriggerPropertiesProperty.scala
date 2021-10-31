package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TriggerPropertiesProperty {

  def apply(
    scheduled: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty.Builder)
      .scheduled(scheduled.orNull)
      .build()
}
