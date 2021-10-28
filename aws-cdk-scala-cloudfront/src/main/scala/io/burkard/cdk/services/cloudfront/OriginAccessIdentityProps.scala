package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginAccessIdentityProps {

  def apply(
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps =
    (new software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps.Builder)
      .comment(comment.orNull)
      .build()
}
