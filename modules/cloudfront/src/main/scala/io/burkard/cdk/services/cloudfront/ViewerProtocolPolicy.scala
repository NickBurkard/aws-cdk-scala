package io.burkard.cdk.services.cloudfront


sealed abstract class ViewerProtocolPolicy(val underlying: software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy)
  extends Product
    with Serializable


object ViewerProtocolPolicy {
  implicit def toAws(value: ViewerProtocolPolicy): software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy =
    Option(value).map(_.underlying).orNull

  case object HttpsOnly
    extends ViewerProtocolPolicy(software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy.HTTPS_ONLY)

  case object RedirectToHttps
    extends ViewerProtocolPolicy(software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy.REDIRECT_TO_HTTPS)

  case object AllowAll
    extends ViewerProtocolPolicy(software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy.ALLOW_ALL)
}
