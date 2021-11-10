package io.burkard.cdk.services.elasticsearch


sealed abstract class TLSSecurityPolicy(val underlying: software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy)
  extends Product
    with Serializable


object TLSSecurityPolicy {
  implicit def toAws(value: TLSSecurityPolicy): software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy =
    Option(value).map(_.underlying).orNull

  case object Tls10
    extends TLSSecurityPolicy(software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy.TLS_1_0)

  case object Tls12
    extends TLSSecurityPolicy(software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy.TLS_1_2)
}
