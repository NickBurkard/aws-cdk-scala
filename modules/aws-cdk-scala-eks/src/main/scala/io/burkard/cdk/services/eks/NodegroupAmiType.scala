package io.burkard.cdk.services.eks

sealed abstract class NodegroupAmiType(val underlying: software.amazon.awscdk.services.eks.NodegroupAmiType)
  extends Product
    with Serializable

object NodegroupAmiType {
  implicit def toAws(value: NodegroupAmiType): software.amazon.awscdk.services.eks.NodegroupAmiType =
    Option(value).map(_.underlying).orNull

  case object Al2X8664
    extends NodegroupAmiType(software.amazon.awscdk.services.eks.NodegroupAmiType.AL2_X86_64)

  case object Al2X8664Gpu
    extends NodegroupAmiType(software.amazon.awscdk.services.eks.NodegroupAmiType.AL2_X86_64_GPU)

  case object Al2Arm64
    extends NodegroupAmiType(software.amazon.awscdk.services.eks.NodegroupAmiType.AL2_ARM_64)
}
