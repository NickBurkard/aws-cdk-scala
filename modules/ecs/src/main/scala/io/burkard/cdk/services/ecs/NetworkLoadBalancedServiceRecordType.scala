package io.burkard.cdk.services.ecs


sealed abstract class NetworkLoadBalancedServiceRecordType(val underlying: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType)
  extends Product
    with Serializable


object NetworkLoadBalancedServiceRecordType {
  implicit def toAws(value: NetworkLoadBalancedServiceRecordType): software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType =
    Option(value).map(_.underlying).orNull

  case object Alias
    extends NetworkLoadBalancedServiceRecordType(software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType.ALIAS)

  case object Cname
    extends NetworkLoadBalancedServiceRecordType(software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType.CNAME)

  case object None
    extends NetworkLoadBalancedServiceRecordType(software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType.NONE)
}
