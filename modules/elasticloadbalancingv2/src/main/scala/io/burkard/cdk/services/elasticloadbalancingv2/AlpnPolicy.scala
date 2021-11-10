package io.burkard.cdk.services.elasticloadbalancingv2


sealed abstract class AlpnPolicy(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy)
  extends Product
    with Serializable


object AlpnPolicy {
  implicit def toAws(value: AlpnPolicy): software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy =
    Option(value).map(_.underlying).orNull

  case object Http1Only
    extends AlpnPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP1_ONLY)

  case object Http2Only
    extends AlpnPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP2_ONLY)

  case object Http2Optional
    extends AlpnPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP2_OPTIONAL)

  case object Http2Preferred
    extends AlpnPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP2_PREFERRED)

  case object None
    extends AlpnPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.NONE)
}
