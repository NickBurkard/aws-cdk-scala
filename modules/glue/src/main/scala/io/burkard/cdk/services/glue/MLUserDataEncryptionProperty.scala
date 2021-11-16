package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MLUserDataEncryptionProperty {

  def apply(
    mlUserDataEncryptionMode: String,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty =
    (new software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty.Builder)
      .mlUserDataEncryptionMode(mlUserDataEncryptionMode)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
