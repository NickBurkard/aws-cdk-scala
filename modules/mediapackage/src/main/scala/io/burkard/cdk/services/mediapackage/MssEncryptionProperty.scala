package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MssEncryptionProperty {

  def apply(
    spekeKeyProvider: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty.Builder)
      .spekeKeyProvider(spekeKeyProvider.orNull)
      .build()
}
