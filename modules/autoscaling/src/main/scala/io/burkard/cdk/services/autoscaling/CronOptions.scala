package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CronOptions {

  def apply(
    minute: Option[String] = None,
    hour: Option[String] = None,
    day: Option[String] = None,
    weekDay: Option[String] = None,
    month: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CronOptions =
    (new software.amazon.awscdk.services.autoscaling.CronOptions.Builder)
      .minute(minute.orNull)
      .hour(hour.orNull)
      .day(day.orNull)
      .weekDay(weekDay.orNull)
      .month(month.orNull)
      .build()
}
