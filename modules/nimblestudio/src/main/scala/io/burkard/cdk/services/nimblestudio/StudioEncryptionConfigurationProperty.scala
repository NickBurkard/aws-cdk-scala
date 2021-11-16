package io.burkard.cdk.services.nimblestudio

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StudioEncryptionConfigurationProperty {

  def apply(
    keyType: String,
    keyArn: Option[String] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty.Builder)
      .keyType(keyType)
      .keyArn(keyArn.orNull)
      .build()
}
