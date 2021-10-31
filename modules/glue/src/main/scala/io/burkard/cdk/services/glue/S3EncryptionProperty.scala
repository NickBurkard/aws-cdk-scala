package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3EncryptionProperty {

  def apply(
    s3EncryptionMode: Option[String] = None,
    kmsKeyArn: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty =
    (new software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty.Builder)
      .s3EncryptionMode(s3EncryptionMode.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .build()
}
