package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CmafEncryptionProperty {

  def apply(
    spekeKeyProvider: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty,
    keyRotationIntervalSeconds: Option[Number] = None,
    constantInitializationVector: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty.Builder)
      .spekeKeyProvider(spekeKeyProvider)
      .keyRotationIntervalSeconds(keyRotationIntervalSeconds.orNull)
      .constantInitializationVector(constantInitializationVector.orNull)
      .build()
}
