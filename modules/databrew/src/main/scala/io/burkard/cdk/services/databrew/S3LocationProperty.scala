package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3LocationProperty {

  def apply(
    key: Option[String] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty.Builder)
      .key(key.orNull)
      .bucket(bucket.orNull)
      .build()
}
