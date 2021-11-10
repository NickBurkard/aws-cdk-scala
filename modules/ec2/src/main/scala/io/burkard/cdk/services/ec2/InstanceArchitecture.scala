package io.burkard.cdk.services.ec2


sealed abstract class InstanceArchitecture(val underlying: software.amazon.awscdk.services.ec2.InstanceArchitecture)
  extends Product
    with Serializable


object InstanceArchitecture {
  implicit def toAws(value: InstanceArchitecture): software.amazon.awscdk.services.ec2.InstanceArchitecture =
    Option(value).map(_.underlying).orNull

  case object Arm64
    extends InstanceArchitecture(software.amazon.awscdk.services.ec2.InstanceArchitecture.ARM_64)

  case object X8664
    extends InstanceArchitecture(software.amazon.awscdk.services.ec2.InstanceArchitecture.X86_64)
}
