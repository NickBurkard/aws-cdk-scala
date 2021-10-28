package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PublicKey {

  def apply(
    internalResourceId: String,
    encodedKey: Option[String] = None,
    publicKeyName: Option[String] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.PublicKey =
    software.amazon.awscdk.services.cloudfront.PublicKey.Builder
      .create(stackCtx, internalResourceId)
      .encodedKey(encodedKey.orNull)
      .publicKeyName(publicKeyName.orNull)
      .comment(comment.orNull)
      .build()
}
