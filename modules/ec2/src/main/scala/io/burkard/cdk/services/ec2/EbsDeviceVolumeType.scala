package io.burkard.cdk.services.ec2

sealed abstract class EbsDeviceVolumeType(val underlying: software.amazon.awscdk.services.ec2.EbsDeviceVolumeType)
  extends Product
    with Serializable

object EbsDeviceVolumeType {
  implicit def toAws(value: EbsDeviceVolumeType): software.amazon.awscdk.services.ec2.EbsDeviceVolumeType =
    Option(value).map(_.underlying).orNull

  case object Standard
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.STANDARD)

  case object Io1
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.IO1)

  case object Io2
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.IO2)

  case object Gp2
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.GP2)

  case object Gp3
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.GP3)

  case object St1
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.ST1)

  case object Sc1
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.SC1)
}
