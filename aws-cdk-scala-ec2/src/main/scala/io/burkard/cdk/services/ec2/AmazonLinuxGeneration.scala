package io.burkard.cdk.services.ec2

sealed abstract class AmazonLinuxGeneration(val underlying: software.amazon.awscdk.services.ec2.AmazonLinuxGeneration)
  extends Product
    with Serializable

object AmazonLinuxGeneration {
  implicit def toAws(value: AmazonLinuxGeneration): software.amazon.awscdk.services.ec2.AmazonLinuxGeneration =
    Option(value).map(_.underlying).orNull

  case object AmazonLinux
    extends AmazonLinuxGeneration(software.amazon.awscdk.services.ec2.AmazonLinuxGeneration.AMAZON_LINUX)

  case object AmazonLinux2
    extends AmazonLinuxGeneration(software.amazon.awscdk.services.ec2.AmazonLinuxGeneration.AMAZON_LINUX_2)
}
