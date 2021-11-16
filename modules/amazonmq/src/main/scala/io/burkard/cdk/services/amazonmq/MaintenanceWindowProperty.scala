package io.burkard.cdk.services.amazonmq

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MaintenanceWindowProperty {

  def apply(
    timeZone: String,
    timeOfDay: String,
    dayOfWeek: String
  ): software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty =
    (new software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder)
      .timeZone(timeZone)
      .timeOfDay(timeOfDay)
      .dayOfWeek(dayOfWeek)
      .build()
}
