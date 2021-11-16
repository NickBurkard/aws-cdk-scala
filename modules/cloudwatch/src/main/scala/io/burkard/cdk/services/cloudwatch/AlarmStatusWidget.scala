package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlarmStatusWidget {

  def apply(
    alarms: List[_ <: software.amazon.awscdk.services.cloudwatch.IAlarm],
    height: Option[Number] = None,
    title: Option[String] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget =
    software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget.Builder
      .create()
      .alarms(alarms.asJava)
      .height(height.orNull)
      .title(title.orNull)
      .width(width.orNull)
      .build()
}
