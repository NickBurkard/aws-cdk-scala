package io.burkard.cdk.services.elasticloadbalancingv2


sealed abstract class TargetType(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.TargetType)
  extends Product
    with Serializable


object TargetType {
  implicit def toAws(value: TargetType): software.amazon.awscdk.services.elasticloadbalancingv2.TargetType =
    Option(value).map(_.underlying).orNull

  case object Instance
    extends TargetType(software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.INSTANCE)

  case object Ip
    extends TargetType(software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.IP)

  case object Lambda
    extends TargetType(software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.LAMBDA)

  case object Alb
    extends TargetType(software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.ALB)
}
