package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationSettingsProps {

  def apply(
    cloudWatchMetricsEnabled: Option[Boolean] = None,
    campaignHook: Option[software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty] = None,
    limits: Option[software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty] = None,
    applicationId: Option[String] = None,
    quietTime: Option[software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps =
    (new software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps.Builder)
      .cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .campaignHook(campaignHook.orNull)
      .limits(limits.orNull)
      .applicationId(applicationId.orNull)
      .quietTime(quietTime.orNull)
      .build()
}
