package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionProperty {

  def apply: software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty.Builder)
      
      .build()
}
