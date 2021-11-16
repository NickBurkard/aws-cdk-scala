package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LustreMaintenanceTime {

  def apply(
    minute: Number,
    hour: Number,
    day: software.amazon.awscdk.services.fsx.Weekday
  ): software.amazon.awscdk.services.fsx.LustreMaintenanceTime =
    software.amazon.awscdk.services.fsx.LustreMaintenanceTime.Builder
      .create()
      .minute(minute)
      .hour(hour)
      .day(day)
      .build()
}
