package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudwatchMetricActionProperty {

  def apply(
    metricUnit: String,
    metricName: String,
    roleArn: String,
    metricNamespace: String,
    metricValue: String,
    metricTimestamp: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder)
      .metricUnit(metricUnit)
      .metricName(metricName)
      .roleArn(roleArn)
      .metricNamespace(metricNamespace)
      .metricValue(metricValue)
      .metricTimestamp(metricTimestamp.orNull)
      .build()
}
