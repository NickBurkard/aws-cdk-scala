package io.burkard.cdk.services.signer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SigningProfile {

  def apply(
    internalResourceId: String,
    platform: software.amazon.awscdk.services.signer.Platform,
    signingProfileName: Option[String] = None,
    signatureValidity: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.signer.SigningProfile =
    software.amazon.awscdk.services.signer.SigningProfile.Builder
      .create(stackCtx, internalResourceId)
      .platform(platform)
      .signingProfileName(signingProfileName.orNull)
      .signatureValidity(signatureValidity.orNull)
      .build()
}
