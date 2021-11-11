package io.burkard.cdk.services.elasticloadbalancingv2

sealed abstract class HttpCodeElb(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb)
  extends Product
    with Serializable

object HttpCodeElb {
  implicit def toAws(value: HttpCodeElb): software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb =
    Option(value).map(_.underlying).orNull

  case object Elb3xxCount
    extends HttpCodeElb(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_3XX_COUNT)

  case object Elb4xxCount
    extends HttpCodeElb(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_4XX_COUNT)

  case object Elb5xxCount
    extends HttpCodeElb(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_5XX_COUNT)
}
