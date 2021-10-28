package io.burkard.cdk.services.stepfunctions

sealed abstract class EbsBlockDeviceVolumeType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType)
  extends Product
    with Serializable

object EbsBlockDeviceVolumeType {
  implicit def toAws(value: EbsBlockDeviceVolumeType): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType =
    Option(value).map(_.underlying).orNull

  case object Gp2
    extends EbsBlockDeviceVolumeType(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.GP2)

  case object Io1
    extends EbsBlockDeviceVolumeType(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.IO1)

  case object Standard
    extends EbsBlockDeviceVolumeType(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.STANDARD)
}
