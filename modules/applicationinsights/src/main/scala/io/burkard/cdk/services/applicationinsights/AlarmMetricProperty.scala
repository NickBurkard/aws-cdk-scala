package io.burkard.cdk.services.applicationinsights

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AlarmMetricProperty {

  def apply(
    alarmMetricName: Option[String] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty.Builder)
      .alarmMetricName(alarmMetricName.orNull)
      .build()
}
