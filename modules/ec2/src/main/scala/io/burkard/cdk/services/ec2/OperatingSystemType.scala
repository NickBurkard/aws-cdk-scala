package io.burkard.cdk.services.ec2

sealed abstract class OperatingSystemType(val underlying: software.amazon.awscdk.services.ec2.OperatingSystemType)
  extends Product
    with Serializable

object OperatingSystemType {
  implicit def toAws(value: OperatingSystemType): software.amazon.awscdk.services.ec2.OperatingSystemType =
    Option(value).map(_.underlying).orNull

  case object Linux
    extends OperatingSystemType(software.amazon.awscdk.services.ec2.OperatingSystemType.LINUX)

  case object Unknown
    extends OperatingSystemType(software.amazon.awscdk.services.ec2.OperatingSystemType.UNKNOWN)

  case object Windows
    extends OperatingSystemType(software.amazon.awscdk.services.ec2.OperatingSystemType.WINDOWS)
}
