package io.burkard.cdk.services.ec2

sealed abstract class AmazonLinuxEdition(val underlying: software.amazon.awscdk.services.ec2.AmazonLinuxEdition)
  extends Product
    with Serializable

object AmazonLinuxEdition {
  implicit def toAws(value: AmazonLinuxEdition): software.amazon.awscdk.services.ec2.AmazonLinuxEdition =
    Option(value).map(_.underlying).orNull

  case object Minimal
    extends AmazonLinuxEdition(software.amazon.awscdk.services.ec2.AmazonLinuxEdition.MINIMAL)

  case object Standard
    extends AmazonLinuxEdition(software.amazon.awscdk.services.ec2.AmazonLinuxEdition.STANDARD)
}
