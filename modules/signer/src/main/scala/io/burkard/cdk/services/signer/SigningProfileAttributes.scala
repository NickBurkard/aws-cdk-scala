package io.burkard.cdk.services.signer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SigningProfileAttributes {

  def apply(
    signingProfileName: String,
    signingProfileVersion: String
  ): software.amazon.awscdk.services.signer.SigningProfileAttributes =
    (new software.amazon.awscdk.services.signer.SigningProfileAttributes.Builder)
      .signingProfileName(signingProfileName)
      .signingProfileVersion(signingProfileVersion)
      .build()
}
