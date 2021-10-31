package io.burkard.cdk.services.applicationinsights

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubComponentConfigurationDetailsProperty {

  def apply(
    alarmMetrics: Option[List[_]] = None,
    windowsEvents: Option[List[_]] = None,
    logs: Option[List[_]] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty.Builder)
      .alarmMetrics(alarmMetrics.map(_.asJava).orNull)
      .windowsEvents(windowsEvents.map(_.asJava).orNull)
      .logs(logs.map(_.asJava).orNull)
      .build()
}
