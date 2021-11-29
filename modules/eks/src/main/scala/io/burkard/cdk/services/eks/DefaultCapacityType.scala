package io.burkard.cdk.services.eks

sealed abstract class DefaultCapacityType(val underlying: software.amazon.awscdk.services.eks.DefaultCapacityType)
  extends Product
    with Serializable

object DefaultCapacityType {
  implicit def toAws(value: DefaultCapacityType): software.amazon.awscdk.services.eks.DefaultCapacityType =
    Option(value).map(_.underlying).orNull

  case object Ec2
    extends DefaultCapacityType(software.amazon.awscdk.services.eks.DefaultCapacityType.EC2)

  case object Nodegroup
    extends DefaultCapacityType(software.amazon.awscdk.services.eks.DefaultCapacityType.NODEGROUP)
}
