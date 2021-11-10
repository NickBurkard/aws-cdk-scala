package io.burkard.cdk.services.ec2


sealed abstract class AmazonLinuxStorage(val underlying: software.amazon.awscdk.services.ec2.AmazonLinuxStorage)
  extends Product
    with Serializable


object AmazonLinuxStorage {
  implicit def toAws(value: AmazonLinuxStorage): software.amazon.awscdk.services.ec2.AmazonLinuxStorage =
    Option(value).map(_.underlying).orNull

  case object Ebs
    extends AmazonLinuxStorage(software.amazon.awscdk.services.ec2.AmazonLinuxStorage.EBS)

  case object GeneralPurpose
    extends AmazonLinuxStorage(software.amazon.awscdk.services.ec2.AmazonLinuxStorage.GENERAL_PURPOSE)
}
