package io.burkard.cdk.services.ec2

sealed abstract class CpuCredits(val underlying: software.amazon.awscdk.services.ec2.CpuCredits)
  extends Product
    with Serializable

object CpuCredits {
  implicit def toAws(value: CpuCredits): software.amazon.awscdk.services.ec2.CpuCredits =
    Option(value).map(_.underlying).orNull

  case object Standard
    extends CpuCredits(software.amazon.awscdk.services.ec2.CpuCredits.STANDARD)

  case object Unlimited
    extends CpuCredits(software.amazon.awscdk.services.ec2.CpuCredits.UNLIMITED)
}
