package io.burkard.cdk.services.eks

sealed abstract class CoreDnsComputeType(val underlying: software.amazon.awscdk.services.eks.CoreDnsComputeType)
  extends Product
    with Serializable

object CoreDnsComputeType {
  implicit def toAws(value: CoreDnsComputeType): software.amazon.awscdk.services.eks.CoreDnsComputeType =
    Option(value).map(_.underlying).orNull

  case object Ec2
    extends CoreDnsComputeType(software.amazon.awscdk.services.eks.CoreDnsComputeType.EC2)

  case object Fargate
    extends CoreDnsComputeType(software.amazon.awscdk.services.eks.CoreDnsComputeType.FARGATE)
}
