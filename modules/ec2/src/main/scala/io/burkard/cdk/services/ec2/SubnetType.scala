package io.burkard.cdk.services.ec2

sealed abstract class SubnetType(val underlying: software.amazon.awscdk.services.ec2.SubnetType)
  extends Product
    with Serializable

@scala.annotation.nowarn("cat=deprecation")
object SubnetType {
  implicit def toAws(value: SubnetType): software.amazon.awscdk.services.ec2.SubnetType =
    Option(value).map(_.underlying).orNull

  case object Isolated
    extends SubnetType(software.amazon.awscdk.services.ec2.SubnetType.ISOLATED)

  case object Private
    extends SubnetType(software.amazon.awscdk.services.ec2.SubnetType.PRIVATE)

  case object Public
    extends SubnetType(software.amazon.awscdk.services.ec2.SubnetType.PUBLIC)
}
