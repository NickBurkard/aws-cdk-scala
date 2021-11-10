package io.burkard.cdk.services.elasticloadbalancingv2


sealed abstract class TargetGroupLoadBalancingAlgorithmType(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType)
  extends Product
    with Serializable


object TargetGroupLoadBalancingAlgorithmType {
  implicit def toAws(value: TargetGroupLoadBalancingAlgorithmType): software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType =
    Option(value).map(_.underlying).orNull

  case object RoundRobin
    extends TargetGroupLoadBalancingAlgorithmType(software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType.ROUND_ROBIN)

  case object LeastOutstandingRequests
    extends TargetGroupLoadBalancingAlgorithmType(software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType.LEAST_OUTSTANDING_REQUESTS)
}
