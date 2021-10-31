package io.burkard.cdk.services.healthlake

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SseConfigurationProperty {

  def apply(
    kmsEncryptionConfig: Option[software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty] = None
  ): software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty =
    (new software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty.Builder)
      .kmsEncryptionConfig(kmsEncryptionConfig.orNull)
      .build()
}
