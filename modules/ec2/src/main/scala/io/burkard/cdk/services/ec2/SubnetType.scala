package io.burkard.cdk.services.ec2

sealed abstract class SubnetType(val underlying: software.amazon.awscdk.services.ec2.SubnetType)
  extends Product
    with Serializable

object SubnetType {
  implicit def toAws(value: SubnetType): software.amazon.awscdk.services.ec2.SubnetType =
    Option(value).map(_.underlying).orNull

  @scala.annotation.nowarn("cat=deprecation") case object Isolated
    extends SubnetType(software.amazon.awscdk.services.ec2.SubnetType.ISOLATED)

  @scala.annotation.nowarn("cat=deprecation") case object Private
    extends SubnetType(software.amazon.awscdk.services.ec2.SubnetType.PRIVATE)

  case object Public
    extends SubnetType(software.amazon.awscdk.services.ec2.SubnetType.PUBLIC)
}
