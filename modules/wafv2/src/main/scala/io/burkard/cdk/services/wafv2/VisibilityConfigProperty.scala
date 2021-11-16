package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VisibilityConfigProperty {

  def apply(
    cloudWatchMetricsEnabled: Boolean,
    sampledRequestsEnabled: Boolean,
    metricName: String
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty.Builder)
      .cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
      .sampledRequestsEnabled(sampledRequestsEnabled)
      .metricName(metricName)
      .build()
}
