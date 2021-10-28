package io.burkard.cdk.services.elasticloadbalancingv2

sealed abstract class HttpCodeTarget(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget)
  extends Product
    with Serializable

object HttpCodeTarget {
  implicit def toAws(value: HttpCodeTarget): software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget =
    Option(value).map(_.underlying).orNull

  case object Target2xxCount
    extends HttpCodeTarget(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_2XX_COUNT)

  case object Target3xxCount
    extends HttpCodeTarget(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_3XX_COUNT)

  case object Target4xxCount
    extends HttpCodeTarget(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_4XX_COUNT)

  case object Target5xxCount
    extends HttpCodeTarget(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_5XX_COUNT)
}
