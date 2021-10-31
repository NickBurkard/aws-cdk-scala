package io.burkard.cdk.services.signer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SigningProfile {

  def apply(
    internalResourceId: String,
    signingProfileName: Option[String] = None,
    signatureValidity: Option[software.amazon.awscdk.Duration] = None,
    platform: Option[software.amazon.awscdk.services.signer.Platform] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.signer.SigningProfile =
    software.amazon.awscdk.services.signer.SigningProfile.Builder
      .create(stackCtx, internalResourceId)
      .signingProfileName(signingProfileName.orNull)
      .signatureValidity(signatureValidity.orNull)
      .platform(platform.orNull)
      .build()
}
