package io.burkard.cdk.services.cloudfront

sealed abstract class SecurityPolicyProtocol(val underlying: software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol)
  extends Product
    with Serializable

object SecurityPolicyProtocol {
  implicit def toAws(value: SecurityPolicyProtocol): software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol =
    Option(value).map(_.underlying).orNull

  case object SslV3
    extends SecurityPolicyProtocol(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.SSL_V3)

  case object TlsV1
    extends SecurityPolicyProtocol(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1)

  case object TlsV112016
    extends SecurityPolicyProtocol(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_1_2016)

  case object TlsV122018
    extends SecurityPolicyProtocol(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2_2018)

  case object TlsV122019
    extends SecurityPolicyProtocol(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2_2019)

  case object TlsV122021
    extends SecurityPolicyProtocol(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2_2021)

  case object TlsV12016
    extends SecurityPolicyProtocol(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2016)
}
