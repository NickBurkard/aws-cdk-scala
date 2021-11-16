package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LocationProperty {

  def apply(
    bucket: String,
    key: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty.Builder)
      .bucket(bucket)
      .key(key.orNull)
      .build()
}
