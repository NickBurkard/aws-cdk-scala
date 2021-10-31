package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPublicKeyProps {

  def apply(
    publicKeyConfig: Option[software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps =
    (new software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps.Builder)
      .publicKeyConfig(publicKeyConfig.orNull)
      .build()
}
