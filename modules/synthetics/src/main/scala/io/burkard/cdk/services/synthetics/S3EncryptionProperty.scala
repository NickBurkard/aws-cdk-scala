package io.burkard.cdk.services.synthetics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3EncryptionProperty {

  def apply(
    kmsKeyArn: Option[String] = None,
    encryptionMode: Option[String] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty.Builder)
      .kmsKeyArn(kmsKeyArn.orNull)
      .encryptionMode(encryptionMode.orNull)
      .build()
}
