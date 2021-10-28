package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PublicKeyProps {

  def apply(
    encodedKey: Option[String] = None,
    publicKeyName: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.PublicKeyProps =
    (new software.amazon.awscdk.services.cloudfront.PublicKeyProps.Builder)
      .encodedKey(encodedKey.orNull)
      .publicKeyName(publicKeyName.orNull)
      .comment(comment.orNull)
      .build()
}
