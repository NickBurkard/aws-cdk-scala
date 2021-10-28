package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationSettings {

  def apply(
    internalResourceId: String,
    cloudWatchMetricsEnabled: Option[Boolean] = None,
    campaignHook: Option[software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty] = None,
    limits: Option[software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty] = None,
    applicationId: Option[String] = None,
    quietTime: Option[software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnApplicationSettings =
    software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.Builder
      .create(stackCtx, internalResourceId)
      .cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .campaignHook(campaignHook.orNull)
      .limits(limits.orNull)
      .applicationId(applicationId.orNull)
      .quietTime(quietTime.orNull)
      .build()
}
