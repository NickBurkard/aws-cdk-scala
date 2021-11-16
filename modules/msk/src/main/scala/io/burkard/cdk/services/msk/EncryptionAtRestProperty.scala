package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionAtRestProperty {

  def apply(
    dataVolumeKmsKeyId: String
  ): software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty.Builder)
      .dataVolumeKmsKeyId(dataVolumeKmsKeyId)
      .build()
}
