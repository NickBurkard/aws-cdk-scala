package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublicKeyProps {

  def apply(
    encodedKey: String,
    publicKeyName: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.PublicKeyProps =
    (new software.amazon.awscdk.services.cloudfront.PublicKeyProps.Builder)
      .encodedKey(encodedKey)
      .publicKeyName(publicKeyName.orNull)
      .comment(comment.orNull)
      .build()
}
