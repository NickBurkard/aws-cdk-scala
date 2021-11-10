package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LocationProperty {

  def apply(
    key: Option[String] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty.Builder)
      .key(key.orNull)
      .bucket(bucket.orNull)
      .build()
}
