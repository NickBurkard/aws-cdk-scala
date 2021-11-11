package io.burkard.cdk.services.autoscaling

@scala.annotation.nowarn("cat=deprecation")
sealed abstract class UpdateType(val underlying: software.amazon.awscdk.services.autoscaling.UpdateType)
  extends Product
    with Serializable

@scala.annotation.nowarn("cat=deprecation")
object UpdateType {
  implicit def toAws(value: UpdateType): software.amazon.awscdk.services.autoscaling.UpdateType =
    Option(value).map(_.underlying).orNull

  case object None
    extends UpdateType(software.amazon.awscdk.services.autoscaling.UpdateType.NONE)

  case object ReplacingUpdate
    extends UpdateType(software.amazon.awscdk.services.autoscaling.UpdateType.REPLACING_UPDATE)

  case object RollingUpdate
    extends UpdateType(software.amazon.awscdk.services.autoscaling.UpdateType.ROLLING_UPDATE)
}
