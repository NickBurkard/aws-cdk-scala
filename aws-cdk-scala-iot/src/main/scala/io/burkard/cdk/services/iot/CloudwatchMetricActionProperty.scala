package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudwatchMetricActionProperty {

  def apply(
    metricUnit: Option[String] = None,
    metricName: Option[String] = None,
    roleArn: Option[String] = None,
    metricNamespace: Option[String] = None,
    metricValue: Option[String] = None,
    metricTimestamp: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder)
      .metricUnit(metricUnit.orNull)
      .metricName(metricName.orNull)
      .roleArn(roleArn.orNull)
      .metricNamespace(metricNamespace.orNull)
      .metricValue(metricValue.orNull)
      .metricTimestamp(metricTimestamp.orNull)
      .build()
}
