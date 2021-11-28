package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MssEncryptionProperty {

  def apply(
    spekeKeyProvider: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty.Builder)
      .spekeKeyProvider(spekeKeyProvider)
      .build()
}
