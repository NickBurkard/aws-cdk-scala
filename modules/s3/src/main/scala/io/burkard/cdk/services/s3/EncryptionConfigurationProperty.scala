package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionConfigurationProperty {

  def apply(
    replicaKmsKeyId: String
  ): software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty.Builder)
      .replicaKmsKeyId(replicaKmsKeyId)
      .build()
}
