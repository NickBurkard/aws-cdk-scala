package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3PathProperty {

  def apply(
    key: Option[String] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty =
    (new software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty.Builder)
      .key(key.orNull)
      .bucket(bucket.orNull)
      .build()
}
