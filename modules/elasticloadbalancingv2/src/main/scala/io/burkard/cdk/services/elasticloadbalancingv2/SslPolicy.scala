package io.burkard.cdk.services.elasticloadbalancingv2

sealed abstract class SslPolicy(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy)
  extends Product
    with Serializable

object SslPolicy {
  implicit def toAws(value: SslPolicy): software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy =
    Option(value).map(_.underlying).orNull

  case object ForwardSecrecy
    extends SslPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FORWARD_SECRECY)

  case object ForwardSecrecyTls11
    extends SslPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FORWARD_SECRECY_TLS11)

  case object ForwardSecrecyTls12
    extends SslPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FORWARD_SECRECY_TLS12)

  case object ForwardSecrecyTls12Res
    extends SslPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FORWARD_SECRECY_TLS12_RES)

  case object ForwardSecrecyTls12ResGcm
    extends SslPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FORWARD_SECRECY_TLS12_RES_GCM)

  case object Legacy
    extends SslPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.LEGACY)

  case object Recommended
    extends SslPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.RECOMMENDED)

  case object Tls11
    extends SslPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS11)

  case object Tls12
    extends SslPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS12)

  case object Tls12Ext
    extends SslPolicy(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS12_EXT)
}
