package io.burkard.cdk.core

sealed abstract class CfnTrafficRoutingType(val underlying: software.amazon.awscdk.CfnTrafficRoutingType)
  extends Product
    with Serializable

object CfnTrafficRoutingType {
  implicit def toAws(value: CfnTrafficRoutingType): software.amazon.awscdk.CfnTrafficRoutingType =
    Option(value).map(_.underlying).orNull

  case object AllAtOnce
    extends CfnTrafficRoutingType(software.amazon.awscdk.CfnTrafficRoutingType.ALL_AT_ONCE)

  case object TimeBasedCanary
    extends CfnTrafficRoutingType(software.amazon.awscdk.CfnTrafficRoutingType.TIME_BASED_CANARY)

  case object TimeBasedLinear
    extends CfnTrafficRoutingType(software.amazon.awscdk.CfnTrafficRoutingType.TIME_BASED_LINEAR)
}
