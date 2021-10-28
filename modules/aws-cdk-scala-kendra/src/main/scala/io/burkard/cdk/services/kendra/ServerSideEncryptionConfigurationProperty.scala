package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServerSideEncryptionConfigurationProperty {

  def apply(
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty.Builder)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
