package io.burkard.cdk.services.wisdom

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerSideEncryptionConfigurationProperty {

  def apply(
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty.Builder)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
