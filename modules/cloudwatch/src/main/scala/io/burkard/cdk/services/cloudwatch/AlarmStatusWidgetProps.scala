package io.burkard.cdk.services.cloudwatch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AlarmStatusWidgetProps {

  def apply(
    height: Option[Number] = None,
    alarms: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.IAlarm]] = None,
    title: Option[String] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps =
    (new software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps.Builder)
      .height(height.orNull)
      .alarms(alarms.map(_.asJava).orNull)
      .title(title.orNull)
      .width(width.orNull)
      .build()
}
