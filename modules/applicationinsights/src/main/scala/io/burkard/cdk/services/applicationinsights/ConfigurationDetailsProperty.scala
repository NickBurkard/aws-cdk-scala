package io.burkard.cdk.services.applicationinsights

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigurationDetailsProperty {

  def apply(
    alarmMetrics: Option[List[_]] = None,
    windowsEvents: Option[List[_]] = None,
    alarms: Option[List[_]] = None,
    jmxPrometheusExporter: Option[software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty] = None,
    logs: Option[List[_]] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty.Builder)
      .alarmMetrics(alarmMetrics.map(_.asJava).orNull)
      .windowsEvents(windowsEvents.map(_.asJava).orNull)
      .alarms(alarms.map(_.asJava).orNull)
      .jmxPrometheusExporter(jmxPrometheusExporter.orNull)
      .logs(logs.map(_.asJava).orNull)
      .build()
}
