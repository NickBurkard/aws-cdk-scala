package io.burkard.cdk.services.eks


sealed abstract class CpuArch(val underlying: software.amazon.awscdk.services.eks.CpuArch)
  extends Product
    with Serializable


object CpuArch {
  implicit def toAws(value: CpuArch): software.amazon.awscdk.services.eks.CpuArch =
    Option(value).map(_.underlying).orNull

  case object Arm64
    extends CpuArch(software.amazon.awscdk.services.eks.CpuArch.ARM_64)

  case object X8664
    extends CpuArch(software.amazon.awscdk.services.eks.CpuArch.X86_64)
}
