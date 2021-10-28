package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LustreMaintenanceTimeProps {

  def apply(
    minute: Option[Number] = None,
    hour: Option[Number] = None,
    day: Option[software.amazon.awscdk.services.fsx.Weekday] = None
  ): software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps =
    (new software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps.Builder)
      .minute(minute.orNull)
      .hour(hour.orNull)
      .day(day.orNull)
      .build()
}
