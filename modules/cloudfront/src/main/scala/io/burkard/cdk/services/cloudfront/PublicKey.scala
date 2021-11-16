package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublicKey {

  def apply(
    internalResourceId: String,
    encodedKey: String,
    publicKeyName: Option[String] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.PublicKey =
    software.amazon.awscdk.services.cloudfront.PublicKey.Builder
      .create(stackCtx, internalResourceId)
      .encodedKey(encodedKey)
      .publicKeyName(publicKeyName.orNull)
      .comment(comment.orNull)
      .build()
}
