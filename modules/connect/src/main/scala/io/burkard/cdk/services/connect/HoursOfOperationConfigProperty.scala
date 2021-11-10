package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HoursOfOperationConfigProperty {

  def apply(
    startTime: Option[software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty] = None,
    endTime: Option[software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty] = None,
    day: Option[String] = None
  ): software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty =
    (new software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty.Builder)
      .startTime(startTime.orNull)
      .endTime(endTime.orNull)
      .day(day.orNull)
      .build()
}
