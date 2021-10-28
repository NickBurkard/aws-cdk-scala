package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Alarms {

  def apply(
    upperAlarmIntervalIndex: Option[Number] = None,
    lowerAlarmIntervalIndex: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.common.Alarms =
    (new software.amazon.awscdk.services.autoscaling.common.Alarms.Builder)
      .upperAlarmIntervalIndex(upperAlarmIntervalIndex.orNull)
      .lowerAlarmIntervalIndex(lowerAlarmIntervalIndex.orNull)
      .build()
}
