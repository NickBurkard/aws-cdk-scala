package io.burkard.cdk.services.ec2


sealed abstract class DefaultInstanceTenancy(val underlying: software.amazon.awscdk.services.ec2.DefaultInstanceTenancy)
  extends Product
    with Serializable


object DefaultInstanceTenancy {
  implicit def toAws(value: DefaultInstanceTenancy): software.amazon.awscdk.services.ec2.DefaultInstanceTenancy =
    Option(value).map(_.underlying).orNull

  case object Default
    extends DefaultInstanceTenancy(software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.DEFAULT)

  case object Dedicated
    extends DefaultInstanceTenancy(software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.DEDICATED)
}
