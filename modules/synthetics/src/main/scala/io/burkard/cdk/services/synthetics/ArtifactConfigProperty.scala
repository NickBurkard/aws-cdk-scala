package io.burkard.cdk.services.synthetics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArtifactConfigProperty {

  def apply(
    s3Encryption: Option[software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty.Builder)
      .s3Encryption(s3Encryption.orNull)
      .build()
}
