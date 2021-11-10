package io.burkard.cdk.services.cloudwatch


sealed abstract class AlarmState(val underlying: software.amazon.awscdk.services.cloudwatch.AlarmState)
  extends Product
    with Serializable


object AlarmState {
  implicit def toAws(value: AlarmState): software.amazon.awscdk.services.cloudwatch.AlarmState =
    Option(value).map(_.underlying).orNull

  case object Alarm
    extends AlarmState(software.amazon.awscdk.services.cloudwatch.AlarmState.ALARM)

  case object Ok
    extends AlarmState(software.amazon.awscdk.services.cloudwatch.AlarmState.OK)

  case object InsufficientData
    extends AlarmState(software.amazon.awscdk.services.cloudwatch.AlarmState.INSUFFICIENT_DATA)
}
