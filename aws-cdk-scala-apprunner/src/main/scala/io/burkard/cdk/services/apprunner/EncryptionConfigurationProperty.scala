package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionConfigurationProperty {

  def apply(
    kmsKey: Option[String] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty.Builder)
      .kmsKey(kmsKey.orNull)
      .build()
}
