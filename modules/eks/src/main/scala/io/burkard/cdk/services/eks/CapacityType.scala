package io.burkard.cdk.services.eks

sealed abstract class CapacityType(val underlying: software.amazon.awscdk.services.eks.CapacityType)
  extends Product
    with Serializable

object CapacityType {
  implicit def toAws(value: CapacityType): software.amazon.awscdk.services.eks.CapacityType =
    Option(value).map(_.underlying).orNull

  case object OnDemand
    extends CapacityType(software.amazon.awscdk.services.eks.CapacityType.ON_DEMAND)

  case object Spot
    extends CapacityType(software.amazon.awscdk.services.eks.CapacityType.SPOT)
}
