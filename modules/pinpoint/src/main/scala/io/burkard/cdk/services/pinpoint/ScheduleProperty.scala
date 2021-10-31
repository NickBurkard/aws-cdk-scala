package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduleProperty {

  def apply(
    startTime: Option[String] = None,
    quietTime: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty] = None,
    eventFilter: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty] = None,
    endTime: Option[String] = None,
    isLocalTime: Option[Boolean] = None,
    frequency: Option[String] = None,
    timeZone: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty.Builder)
      .startTime(startTime.orNull)
      .quietTime(quietTime.orNull)
      .eventFilter(eventFilter.orNull)
      .endTime(endTime.orNull)
      .isLocalTime(isLocalTime.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .frequency(frequency.orNull)
      .timeZone(timeZone.orNull)
      .build()
}
