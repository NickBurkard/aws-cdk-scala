package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlarmWidgetProps {

  def apply(
    height: Option[Number] = None,
    region: Option[String] = None,
    title: Option[String] = None,
    leftYAxis: Option[software.amazon.awscdk.services.cloudwatch.YAxisProps] = None,
    width: Option[Number] = None,
    alarm: Option[software.amazon.awscdk.services.cloudwatch.IAlarm] = None
  ): software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps =
    (new software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder)
      .height(height.orNull)
      .region(region.orNull)
      .title(title.orNull)
      .leftYAxis(leftYAxis.orNull)
      .width(width.orNull)
      .alarm(alarm.orNull)
      .build()
}
