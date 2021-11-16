package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublicKeyConfigProperty {

  def apply(
    name: String,
    encodedKey: String,
    callerReference: String,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty.Builder)
      .name(name)
      .encodedKey(encodedKey)
      .callerReference(callerReference)
      .comment(comment.orNull)
      .build()
}
