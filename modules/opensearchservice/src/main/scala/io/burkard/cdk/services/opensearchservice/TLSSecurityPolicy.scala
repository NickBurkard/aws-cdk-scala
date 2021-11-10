package io.burkard.cdk.services.opensearchservice


sealed abstract class TLSSecurityPolicy(val underlying: software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy)
  extends Product
    with Serializable


object TLSSecurityPolicy {
  implicit def toAws(value: TLSSecurityPolicy): software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy =
    Option(value).map(_.underlying).orNull

  case object Tls10
    extends TLSSecurityPolicy(software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy.TLS_1_0)

  case object Tls12
    extends TLSSecurityPolicy(software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy.TLS_1_2)
}
