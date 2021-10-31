package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerSideEncryptionConfigurationProperty {

  def apply(
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty.Builder)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
