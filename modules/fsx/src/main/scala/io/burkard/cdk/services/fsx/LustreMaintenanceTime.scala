package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LustreMaintenanceTime {

  def apply(
    minute: Option[Number] = None,
    hour: Option[Number] = None,
    day: Option[software.amazon.awscdk.services.fsx.Weekday] = None
  ): software.amazon.awscdk.services.fsx.LustreMaintenanceTime =
    software.amazon.awscdk.services.fsx.LustreMaintenanceTime.Builder
      .create()
      .minute(minute.orNull)
      .hour(hour.orNull)
      .day(day.orNull)
      .build()
}
