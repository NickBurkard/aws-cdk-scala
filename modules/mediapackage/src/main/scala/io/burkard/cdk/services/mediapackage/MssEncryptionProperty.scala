package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MssEncryptionProperty {

  def apply(
    spekeKeyProvider: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty.Builder)
      .spekeKeyProvider(spekeKeyProvider)
      .build()
}
