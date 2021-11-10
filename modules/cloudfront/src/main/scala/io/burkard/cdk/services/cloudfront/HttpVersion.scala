package io.burkard.cdk.services.cloudfront


sealed abstract class HttpVersion(val underlying: software.amazon.awscdk.services.cloudfront.HttpVersion)
  extends Product
    with Serializable


object HttpVersion {
  implicit def toAws(value: HttpVersion): software.amazon.awscdk.services.cloudfront.HttpVersion =
    Option(value).map(_.underlying).orNull

  case object Http11
    extends HttpVersion(software.amazon.awscdk.services.cloudfront.HttpVersion.HTTP1_1)

  case object Http2
    extends HttpVersion(software.amazon.awscdk.services.cloudfront.HttpVersion.HTTP2)
}
