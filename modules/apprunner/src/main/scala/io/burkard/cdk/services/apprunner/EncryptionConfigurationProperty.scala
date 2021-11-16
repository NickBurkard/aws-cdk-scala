package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionConfigurationProperty {

  def apply(
    kmsKey: String
  ): software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty.Builder)
      .kmsKey(kmsKey)
      .build()
}
