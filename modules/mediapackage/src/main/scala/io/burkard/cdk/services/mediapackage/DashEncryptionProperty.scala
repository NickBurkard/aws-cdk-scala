package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DashEncryptionProperty {

  def apply(
    keyRotationIntervalSeconds: Option[Number] = None,
    spekeKeyProvider: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty.Builder)
      .keyRotationIntervalSeconds(keyRotationIntervalSeconds.orNull)
      .spekeKeyProvider(spekeKeyProvider.orNull)
      .build()
}
