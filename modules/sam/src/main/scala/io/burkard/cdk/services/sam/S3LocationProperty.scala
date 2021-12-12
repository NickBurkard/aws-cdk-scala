package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LocationProperty {

  def apply(
    key: String,
    bucket: String,
    version: Option[Number] = None
  ): software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty =
    (new software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty.Builder)
      .key(key)
      .bucket(bucket)
      .version(version.orNull)
      .build()
}
