package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsEncryptionProperty {

  def apply(
    spekeKeyProvider: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty,
    keyRotationIntervalSeconds: Option[Number] = None,
    constantInitializationVector: Option[String] = None,
    repeatExtXKey: Option[Boolean] = None,
    encryptionMethod: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty.Builder)
      .spekeKeyProvider(spekeKeyProvider)
      .keyRotationIntervalSeconds(keyRotationIntervalSeconds.orNull)
      .constantInitializationVector(constantInitializationVector.orNull)
      .repeatExtXKey(repeatExtXKey.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encryptionMethod(encryptionMethod.orNull)
      .build()
}
