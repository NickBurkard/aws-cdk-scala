package io.burkard.cdk.services.healthlake

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KmsEncryptionConfigProperty {

  def apply(
    kmsKeyId: Option[String] = None,
    cmkType: Option[String] = None
  ): software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty =
    (new software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty.Builder)
      .kmsKeyId(kmsKeyId.orNull)
      .cmkType(cmkType.orNull)
      .build()
}
