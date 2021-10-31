package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPublicKey {

  def apply(
    internalResourceId: String,
    publicKeyConfig: Option[software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnPublicKey =
    software.amazon.awscdk.services.cloudfront.CfnPublicKey.Builder
      .create(stackCtx, internalResourceId)
      .publicKeyConfig(publicKeyConfig.orNull)
      .build()
}
