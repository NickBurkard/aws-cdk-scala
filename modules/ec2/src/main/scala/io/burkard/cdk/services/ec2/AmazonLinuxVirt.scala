package io.burkard.cdk.services.ec2

sealed abstract class AmazonLinuxVirt(val underlying: software.amazon.awscdk.services.ec2.AmazonLinuxVirt)
  extends Product
    with Serializable

object AmazonLinuxVirt {
  implicit def toAws(value: AmazonLinuxVirt): software.amazon.awscdk.services.ec2.AmazonLinuxVirt =
    Option(value).map(_.underlying).orNull

  case object Hvm
    extends AmazonLinuxVirt(software.amazon.awscdk.services.ec2.AmazonLinuxVirt.HVM)

  case object Pv
    extends AmazonLinuxVirt(software.amazon.awscdk.services.ec2.AmazonLinuxVirt.PV)
}
