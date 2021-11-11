package io.burkard.cdk.services.eks

sealed abstract class PatchType(val underlying: software.amazon.awscdk.services.eks.PatchType)
  extends Product
    with Serializable

object PatchType {
  implicit def toAws(value: PatchType): software.amazon.awscdk.services.eks.PatchType =
    Option(value).map(_.underlying).orNull

  case object Json
    extends PatchType(software.amazon.awscdk.services.eks.PatchType.JSON)

  case object Merge
    extends PatchType(software.amazon.awscdk.services.eks.PatchType.MERGE)

  case object Strategic
    extends PatchType(software.amazon.awscdk.services.eks.PatchType.STRATEGIC)
}
