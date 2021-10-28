package io.burkard.cdk.services.ecs

sealed abstract class ApplicationLoadBalancedServiceRecordType(val underlying: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType)
  extends Product
    with Serializable

object ApplicationLoadBalancedServiceRecordType {
  implicit def toAws(value: ApplicationLoadBalancedServiceRecordType): software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType =
    Option(value).map(_.underlying).orNull

  case object Alias
    extends ApplicationLoadBalancedServiceRecordType(software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType.ALIAS)

  case object Cname
    extends ApplicationLoadBalancedServiceRecordType(software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType.CNAME)

  case object None
    extends ApplicationLoadBalancedServiceRecordType(software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType.NONE)
}
