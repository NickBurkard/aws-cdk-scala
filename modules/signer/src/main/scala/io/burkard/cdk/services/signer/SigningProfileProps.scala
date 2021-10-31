package io.burkard.cdk.services.signer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SigningProfileProps {

  def apply(
    signingProfileName: Option[String] = None,
    signatureValidity: Option[software.amazon.awscdk.Duration] = None,
    platform: Option[software.amazon.awscdk.services.signer.Platform] = None
  ): software.amazon.awscdk.services.signer.SigningProfileProps =
    (new software.amazon.awscdk.services.signer.SigningProfileProps.Builder)
      .signingProfileName(signingProfileName.orNull)
      .signatureValidity(signatureValidity.orNull)
      .platform(platform.orNull)
      .build()
}
