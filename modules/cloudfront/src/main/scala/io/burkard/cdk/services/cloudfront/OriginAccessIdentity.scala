package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginAccessIdentity {

  def apply(
    internalResourceId: String,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.OriginAccessIdentity =
    software.amazon.awscdk.services.cloudfront.OriginAccessIdentity.Builder
      .create(stackCtx, internalResourceId)
      .comment(comment.orNull)
      .build()
}
