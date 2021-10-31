package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CmafEncryptionProperty {

  def apply(
    keyRotationIntervalSeconds: Option[Number] = None,
    constantInitializationVector: Option[String] = None,
    spekeKeyProvider: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty.Builder)
      .keyRotationIntervalSeconds(keyRotationIntervalSeconds.orNull)
      .constantInitializationVector(constantInitializationVector.orNull)
      .spekeKeyProvider(spekeKeyProvider.orNull)
      .build()
}
