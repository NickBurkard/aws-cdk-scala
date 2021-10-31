package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MLUserDataEncryptionProperty {

  def apply(
    mlUserDataEncryptionMode: Option[String] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty =
    (new software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty.Builder)
      .mlUserDataEncryptionMode(mlUserDataEncryptionMode.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
