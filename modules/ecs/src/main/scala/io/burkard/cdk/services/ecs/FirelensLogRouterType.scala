package io.burkard.cdk.services.ecs


sealed abstract class FirelensLogRouterType(val underlying: software.amazon.awscdk.services.ecs.FirelensLogRouterType)
  extends Product
    with Serializable


object FirelensLogRouterType {
  implicit def toAws(value: FirelensLogRouterType): software.amazon.awscdk.services.ecs.FirelensLogRouterType =
    Option(value).map(_.underlying).orNull

  case object Fluentbit
    extends FirelensLogRouterType(software.amazon.awscdk.services.ecs.FirelensLogRouterType.FLUENTBIT)

  case object Fluentd
    extends FirelensLogRouterType(software.amazon.awscdk.services.ecs.FirelensLogRouterType.FLUENTD)
}
