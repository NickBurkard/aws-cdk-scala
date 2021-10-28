package io.burkard.cdk.services.autoscaling

sealed abstract class Monitoring(val underlying: software.amazon.awscdk.services.autoscaling.Monitoring)
  extends Product
    with Serializable

object Monitoring {
  implicit def toAws(value: Monitoring): software.amazon.awscdk.services.autoscaling.Monitoring =
    Option(value).map(_.underlying).orNull

  case object Basic
    extends Monitoring(software.amazon.awscdk.services.autoscaling.Monitoring.BASIC)

  case object Detailed
    extends Monitoring(software.amazon.awscdk.services.autoscaling.Monitoring.DETAILED)
}
