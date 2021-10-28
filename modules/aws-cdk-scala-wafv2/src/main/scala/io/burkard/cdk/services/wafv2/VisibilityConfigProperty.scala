package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VisibilityConfigProperty {

  def apply(
    cloudWatchMetricsEnabled: Option[Boolean] = None,
    sampledRequestsEnabled: Option[Boolean] = None,
    metricName: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty.Builder)
      .cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sampledRequestsEnabled(sampledRequestsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .metricName(metricName.orNull)
      .build()
}
