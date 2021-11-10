package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HoursOfOperationTimeSliceProperty {

  def apply(
    minutes: Option[Number] = None,
    hours: Option[Number] = None
  ): software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty =
    (new software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty.Builder)
      .minutes(minutes.orNull)
      .hours(hours.orNull)
      .build()
}
