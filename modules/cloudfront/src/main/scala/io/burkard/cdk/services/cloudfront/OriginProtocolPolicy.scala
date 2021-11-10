package io.burkard.cdk.services.cloudfront


sealed abstract class OriginProtocolPolicy(val underlying: software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy)
  extends Product
    with Serializable


object OriginProtocolPolicy {
  implicit def toAws(value: OriginProtocolPolicy): software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy =
    Option(value).map(_.underlying).orNull

  case object HttpOnly
    extends OriginProtocolPolicy(software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy.HTTP_ONLY)

  case object MatchViewer
    extends OriginProtocolPolicy(software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy.MATCH_VIEWER)

  case object HttpsOnly
    extends OriginProtocolPolicy(software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy.HTTPS_ONLY)
}
