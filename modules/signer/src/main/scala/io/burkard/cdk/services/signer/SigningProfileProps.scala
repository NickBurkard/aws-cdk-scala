package io.burkard.cdk.services.signer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SigningProfileProps {

  def apply(
    platform: software.amazon.awscdk.services.signer.Platform,
    signingProfileName: Option[String] = None,
    signatureValidity: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.signer.SigningProfileProps =
    (new software.amazon.awscdk.services.signer.SigningProfileProps.Builder)
      .platform(platform)
      .signingProfileName(signingProfileName.orNull)
      .signatureValidity(signatureValidity.orNull)
      .build()
}
