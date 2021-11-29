package io.burkard.cdk.services.ec2

sealed abstract class SubnetType(val underlying: software.amazon.awscdk.services.ec2.SubnetType)
  extends Product
    with Serializable

object SubnetType {
  implicit def toAws(value: SubnetType): software.amazon.awscdk.services.ec2.SubnetType =
    Option(value).map(_.underlying).orNull

  case object PrivateIsolated
    extends SubnetType(software.amazon.awscdk.services.ec2.SubnetType.PRIVATE_ISOLATED)

  case object PrivateWithNat
    extends SubnetType(software.amazon.awscdk.services.ec2.SubnetType.PRIVATE_WITH_NAT)

  case object Public
    extends SubnetType(software.amazon.awscdk.services.ec2.SubnetType.PUBLIC)
}
