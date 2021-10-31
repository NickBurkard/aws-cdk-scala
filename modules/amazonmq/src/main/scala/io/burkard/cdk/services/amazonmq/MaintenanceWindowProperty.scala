package io.burkard.cdk.services.amazonmq

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MaintenanceWindowProperty {

  def apply(
    timeZone: Option[String] = None,
    timeOfDay: Option[String] = None,
    dayOfWeek: Option[String] = None
  ): software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty =
    (new software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder)
      .timeZone(timeZone.orNull)
      .timeOfDay(timeOfDay.orNull)
      .dayOfWeek(dayOfWeek.orNull)
      .build()
}
