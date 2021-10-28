package io.burkard.cdk.services.ec2

sealed abstract class SpotInstanceInterruption(val underlying: software.amazon.awscdk.services.ec2.SpotInstanceInterruption)
  extends Product
    with Serializable

object SpotInstanceInterruption {
  implicit def toAws(value: SpotInstanceInterruption): software.amazon.awscdk.services.ec2.SpotInstanceInterruption =
    Option(value).map(_.underlying).orNull

  case object Stop
    extends SpotInstanceInterruption(software.amazon.awscdk.services.ec2.SpotInstanceInterruption.STOP)

  case object Terminate
    extends SpotInstanceInterruption(software.amazon.awscdk.services.ec2.SpotInstanceInterruption.TERMINATE)

  case object Hibernate
    extends SpotInstanceInterruption(software.amazon.awscdk.services.ec2.SpotInstanceInterruption.HIBERNATE)
}
