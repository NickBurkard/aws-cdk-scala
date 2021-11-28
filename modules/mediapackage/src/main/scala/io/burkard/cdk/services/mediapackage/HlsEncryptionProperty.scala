package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsEncryptionProperty {

  def apply(
    spekeKeyProvider: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty,
    constantInitializationVector: Option[String] = None,
    encryptionMethod: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty.Builder)
      .spekeKeyProvider(spekeKeyProvider)
      .constantInitializationVector(constantInitializationVector.orNull)
      .encryptionMethod(encryptionMethod.orNull)
      .build()
}
