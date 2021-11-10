package io.burkard.cdk.services.ec2


sealed abstract class InstanceSize(val underlying: software.amazon.awscdk.services.ec2.InstanceSize)
  extends Product
    with Serializable


object InstanceSize {
  implicit def toAws(value: InstanceSize): software.amazon.awscdk.services.ec2.InstanceSize =
    Option(value).map(_.underlying).orNull

  case object Nano
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.NANO)

  case object Micro
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.MICRO)

  case object Small
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.SMALL)

  case object Medium
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.MEDIUM)

  case object Large
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.LARGE)

  case object Xlarge
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE)

  case object Xlarge2
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE2)

  case object Xlarge3
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE3)

  case object Xlarge4
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE4)

  case object Xlarge6
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE6)

  case object Xlarge8
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE8)

  case object Xlarge9
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE9)

  case object Xlarge10
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE10)

  case object Xlarge12
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE12)

  case object Xlarge16
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE16)

  case object Xlarge18
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE18)

  case object Xlarge24
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE24)

  case object Xlarge32
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE32)

  case object Metal
    extends InstanceSize(software.amazon.awscdk.services.ec2.InstanceSize.METAL)
}
