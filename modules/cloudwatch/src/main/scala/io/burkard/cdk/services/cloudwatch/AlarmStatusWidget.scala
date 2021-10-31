package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AlarmStatusWidget {

  def apply(
    height: Option[Number] = None,
    alarms: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.IAlarm]] = None,
    title: Option[String] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget =
    software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget.Builder
      .create()
      .height(height.orNull)
      .alarms(alarms.map(_.asJava).orNull)
      .title(title.orNull)
      .width(width.orNull)
      .build()
}
