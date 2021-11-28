package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DashEncryptionProperty {

  def apply(
    spekeKeyProvider: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty,
    keyRotationIntervalSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty.Builder)
      .spekeKeyProvider(spekeKeyProvider)
      .keyRotationIntervalSeconds(keyRotationIntervalSeconds.orNull)
      .build()
}
