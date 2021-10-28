package io.burkard.cdk.services.ec2

sealed abstract class SpotRequestType(val underlying: software.amazon.awscdk.services.ec2.SpotRequestType)
  extends Product
    with Serializable

object SpotRequestType {
  implicit def toAws(value: SpotRequestType): software.amazon.awscdk.services.ec2.SpotRequestType =
    Option(value).map(_.underlying).orNull

  case object OneTime
    extends SpotRequestType(software.amazon.awscdk.services.ec2.SpotRequestType.ONE_TIME)

  case object Persistent
    extends SpotRequestType(software.amazon.awscdk.services.ec2.SpotRequestType.PERSISTENT)
}
