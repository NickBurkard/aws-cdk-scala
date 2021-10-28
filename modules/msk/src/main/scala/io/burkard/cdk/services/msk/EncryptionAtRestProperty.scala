package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionAtRestProperty {

  def apply(
    dataVolumeKmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty.Builder)
      .dataVolumeKmsKeyId(dataVolumeKmsKeyId.orNull)
      .build()
}