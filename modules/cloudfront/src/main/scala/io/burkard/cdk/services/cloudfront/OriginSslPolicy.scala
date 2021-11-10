package io.burkard.cdk.services.cloudfront


sealed abstract class OriginSslPolicy(val underlying: software.amazon.awscdk.services.cloudfront.OriginSslPolicy)
  extends Product
    with Serializable


object OriginSslPolicy {
  implicit def toAws(value: OriginSslPolicy): software.amazon.awscdk.services.cloudfront.OriginSslPolicy =
    Option(value).map(_.underlying).orNull

  case object SslV3
    extends OriginSslPolicy(software.amazon.awscdk.services.cloudfront.OriginSslPolicy.SSL_V3)

  case object TlsV1
    extends OriginSslPolicy(software.amazon.awscdk.services.cloudfront.OriginSslPolicy.TLS_V1)

  case object TlsV11
    extends OriginSslPolicy(software.amazon.awscdk.services.cloudfront.OriginSslPolicy.TLS_V1_1)

  case object TlsV12
    extends OriginSslPolicy(software.amazon.awscdk.services.cloudfront.OriginSslPolicy.TLS_V1_2)
}
