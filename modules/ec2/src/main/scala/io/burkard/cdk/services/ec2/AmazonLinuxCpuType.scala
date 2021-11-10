package io.burkard.cdk.services.ec2


sealed abstract class AmazonLinuxCpuType(val underlying: software.amazon.awscdk.services.ec2.AmazonLinuxCpuType)
  extends Product
    with Serializable


object AmazonLinuxCpuType {
  implicit def toAws(value: AmazonLinuxCpuType): software.amazon.awscdk.services.ec2.AmazonLinuxCpuType =
    Option(value).map(_.underlying).orNull

  case object Arm64
    extends AmazonLinuxCpuType(software.amazon.awscdk.services.ec2.AmazonLinuxCpuType.ARM_64)

  case object X8664
    extends AmazonLinuxCpuType(software.amazon.awscdk.services.ec2.AmazonLinuxCpuType.X86_64)
}
