package io.burkard.cdk.services.cassandra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionSpecificationProperty {

  def apply(
    encryptionType: String,
    kmsKeyIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty =
    (new software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty.Builder)
      .encryptionType(encryptionType)
      .kmsKeyIdentifier(kmsKeyIdentifier.orNull)
      .build()
}
