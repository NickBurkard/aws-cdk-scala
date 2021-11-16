package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HoursOfOperationTimeSliceProperty {

  def apply(
    minutes: Number,
    hours: Number
  ): software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty =
    (new software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty.Builder)
      .minutes(minutes)
      .hours(hours)
      .build()
}
