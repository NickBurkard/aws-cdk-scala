package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlarmWidget {

  def apply(
    alarm: software.amazon.awscdk.services.cloudwatch.IAlarm,
    height: Option[Number] = None,
    region: Option[String] = None,
    title: Option[String] = None,
    leftYAxis: Option[software.amazon.awscdk.services.cloudwatch.YAxisProps] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.AlarmWidget =
    software.amazon.awscdk.services.cloudwatch.AlarmWidget.Builder
      .create()
      .alarm(alarm)
      .height(height.orNull)
      .region(region.orNull)
      .title(title.orNull)
      .leftYAxis(leftYAxis.orNull)
      .width(width.orNull)
      .build()
}
