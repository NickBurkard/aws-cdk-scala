package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3LocationProperty {

  def apply(
    key: Option[String] = None,
    version: Option[Number] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder)
      .key(key.orNull)
      .version(version.orNull)
      .bucket(bucket.orNull)
      .build()
}
