package io.burkard.cdk.services.eks

sealed abstract class MachineImageType(val underlying: software.amazon.awscdk.services.eks.MachineImageType)
  extends Product
    with Serializable

object MachineImageType {
  implicit def toAws(value: MachineImageType): software.amazon.awscdk.services.eks.MachineImageType =
    Option(value).map(_.underlying).orNull

  case object AmazonLinux2
    extends MachineImageType(software.amazon.awscdk.services.eks.MachineImageType.AMAZON_LINUX_2)

  case object Bottlerocket
    extends MachineImageType(software.amazon.awscdk.services.eks.MachineImageType.BOTTLEROCKET)
}
