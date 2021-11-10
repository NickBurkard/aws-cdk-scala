package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsEncryptionProperty {

  def apply(
    constantInitializationVector: Option[String] = None,
    encryptionMethod: Option[String] = None,
    spekeKeyProvider: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty.Builder)
      .constantInitializationVector(constantInitializationVector.orNull)
      .encryptionMethod(encryptionMethod.orNull)
      .spekeKeyProvider(spekeKeyProvider.orNull)
      .build()
}
