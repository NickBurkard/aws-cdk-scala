package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MssEncryptionProperty {

  def apply(
    spekeKeyProvider: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty.Builder)
      .spekeKeyProvider(spekeKeyProvider.orNull)
      .build()
}
