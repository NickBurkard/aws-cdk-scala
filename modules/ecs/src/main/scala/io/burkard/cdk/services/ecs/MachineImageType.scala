package io.burkard.cdk.services.ecs

sealed abstract class MachineImageType(val underlying: software.amazon.awscdk.services.ecs.MachineImageType)
  extends Product
    with Serializable

object MachineImageType {
  implicit def toAws(value: MachineImageType): software.amazon.awscdk.services.ecs.MachineImageType =
    Option(value).map(_.underlying).orNull

  case object AmazonLinux2
    extends MachineImageType(software.amazon.awscdk.services.ecs.MachineImageType.AMAZON_LINUX_2)

  case object Bottlerocket
    extends MachineImageType(software.amazon.awscdk.services.ecs.MachineImageType.BOTTLEROCKET)
}
