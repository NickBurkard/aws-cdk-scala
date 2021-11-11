package io.burkard.cdk.services.apigateway

sealed abstract class SecurityPolicy(val underlying: software.amazon.awscdk.services.apigateway.SecurityPolicy)
  extends Product
    with Serializable

object SecurityPolicy {
  implicit def toAws(value: SecurityPolicy): software.amazon.awscdk.services.apigateway.SecurityPolicy =
    Option(value).map(_.underlying).orNull

  case object Tls10
    extends SecurityPolicy(software.amazon.awscdk.services.apigateway.SecurityPolicy.TLS_1_0)

  case object Tls12
    extends SecurityPolicy(software.amazon.awscdk.services.apigateway.SecurityPolicy.TLS_1_2)
}
