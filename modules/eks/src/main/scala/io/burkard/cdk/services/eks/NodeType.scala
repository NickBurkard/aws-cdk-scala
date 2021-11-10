package io.burkard.cdk.services.eks


sealed abstract class NodeType(val underlying: software.amazon.awscdk.services.eks.NodeType)
  extends Product
    with Serializable


object NodeType {
  implicit def toAws(value: NodeType): software.amazon.awscdk.services.eks.NodeType =
    Option(value).map(_.underlying).orNull

  case object Standard
    extends NodeType(software.amazon.awscdk.services.eks.NodeType.STANDARD)

  case object Gpu
    extends NodeType(software.amazon.awscdk.services.eks.NodeType.GPU)

  case object Inferentia
    extends NodeType(software.amazon.awscdk.services.eks.NodeType.INFERENTIA)
}
