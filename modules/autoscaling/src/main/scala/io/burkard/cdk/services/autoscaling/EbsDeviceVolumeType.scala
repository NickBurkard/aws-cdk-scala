package io.burkard.cdk.services.autoscaling

sealed abstract class EbsDeviceVolumeType(val underlying: software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType)
  extends Product
    with Serializable

object EbsDeviceVolumeType {
  implicit def toAws(value: EbsDeviceVolumeType): software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType =
    Option(value).map(_.underlying).orNull

  case object Standard
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType.STANDARD)

  case object Io1
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType.IO1)

  case object Gp2
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType.GP2)

  case object Gp3
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType.GP3)

  case object St1
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType.ST1)

  case object Sc1
    extends EbsDeviceVolumeType(software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType.SC1)
}
