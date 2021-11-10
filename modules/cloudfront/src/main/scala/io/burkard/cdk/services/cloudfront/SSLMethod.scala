package io.burkard.cdk.services.cloudfront


sealed abstract class SSLMethod(val underlying: software.amazon.awscdk.services.cloudfront.SSLMethod)
  extends Product
    with Serializable


object SSLMethod {
  implicit def toAws(value: SSLMethod): software.amazon.awscdk.services.cloudfront.SSLMethod =
    Option(value).map(_.underlying).orNull

  case object Sni
    extends SSLMethod(software.amazon.awscdk.services.cloudfront.SSLMethod.SNI)

  case object Vip
    extends SSLMethod(software.amazon.awscdk.services.cloudfront.SSLMethod.VIP)
}
