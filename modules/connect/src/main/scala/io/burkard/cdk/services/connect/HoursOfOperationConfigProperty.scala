package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HoursOfOperationConfigProperty {

  def apply(
    startTime: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty,
    endTime: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty,
    day: String
  ): software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty =
    (new software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty.Builder)
      .startTime(startTime)
      .endTime(endTime)
      .day(day)
      .build()
}
