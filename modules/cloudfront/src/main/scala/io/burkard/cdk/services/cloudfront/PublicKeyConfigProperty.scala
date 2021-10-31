package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublicKeyConfigProperty {

  def apply(
    name: Option[String] = None,
    encodedKey: Option[String] = None,
    callerReference: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty.Builder)
      .name(name.orNull)
      .encodedKey(encodedKey.orNull)
      .callerReference(callerReference.orNull)
      .comment(comment.orNull)
      .build()
}
