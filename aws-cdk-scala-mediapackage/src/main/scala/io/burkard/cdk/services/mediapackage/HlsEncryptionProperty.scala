package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HlsEncryptionProperty {

  def apply(
    keyRotationIntervalSeconds: Option[Number] = None,
    constantInitializationVector: Option[String] = None,
    repeatExtXKey: Option[Boolean] = None,
    encryptionMethod: Option[String] = None,
    spekeKeyProvider: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty.Builder)
      .keyRotationIntervalSeconds(keyRotationIntervalSeconds.orNull)
      .constantInitializationVector(constantInitializationVector.orNull)
      .repeatExtXKey(repeatExtXKey.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encryptionMethod(encryptionMethod.orNull)
      .spekeKeyProvider(spekeKeyProvider.orNull)
      .build()
}
