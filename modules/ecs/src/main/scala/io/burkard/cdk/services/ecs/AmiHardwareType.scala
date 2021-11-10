package io.burkard.cdk.services.ecs


sealed abstract class AmiHardwareType(val underlying: software.amazon.awscdk.services.ecs.AmiHardwareType)
  extends Product
    with Serializable


object AmiHardwareType {
  implicit def toAws(value: AmiHardwareType): software.amazon.awscdk.services.ecs.AmiHardwareType =
    Option(value).map(_.underlying).orNull

  case object Standard
    extends AmiHardwareType(software.amazon.awscdk.services.ecs.AmiHardwareType.STANDARD)

  case object Gpu
    extends AmiHardwareType(software.amazon.awscdk.services.ecs.AmiHardwareType.GPU)

  case object Arm
    extends AmiHardwareType(software.amazon.awscdk.services.ecs.AmiHardwareType.ARM)
}
