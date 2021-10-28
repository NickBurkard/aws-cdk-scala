package io.burkard.cdk.services.signer

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SigningProfileAttributes {

  def apply(
    signingProfileName: Option[String] = None,
    signingProfileVersion: Option[String] = None
  ): software.amazon.awscdk.services.signer.SigningProfileAttributes =
    (new software.amazon.awscdk.services.signer.SigningProfileAttributes.Builder)
      .signingProfileName(signingProfileName.orNull)
      .signingProfileVersion(signingProfileVersion.orNull)
      .build()
}
