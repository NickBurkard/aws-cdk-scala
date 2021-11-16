package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LustreMaintenanceTimeProps {

  def apply(
    minute: Number,
    hour: Number,
    day: software.amazon.awscdk.services.fsx.Weekday
  ): software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps =
    (new software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps.Builder)
      .minute(minute)
      .hour(hour)
      .day(day)
      .build()
}
