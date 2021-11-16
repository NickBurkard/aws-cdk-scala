package io.burkard.cdk.services.healthlake

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KmsEncryptionConfigProperty {

  def apply(
    cmkType: String,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty =
    (new software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty.Builder)
      .cmkType(cmkType)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
