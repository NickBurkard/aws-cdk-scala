package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TriggerPropertiesProperty {

  def apply(
    scheduled: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty.Builder)
      .scheduled(scheduled.orNull)
      .build()
}
