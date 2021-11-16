package io.burkard.cdk.services.healthlake

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SseConfigurationProperty {

  def apply(
    kmsEncryptionConfig: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty
  ): software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty =
    (new software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty.Builder)
      .kmsEncryptionConfig(kmsEncryptionConfig)
      .build()
}
