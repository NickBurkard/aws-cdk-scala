package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Location {

  def apply(
    objectKey: Option[String] = None,
    bucketName: Option[String] = None,
    objectVersion: Option[String] = None
  ): software.amazon.awscdk.services.s3.Location =
    (new software.amazon.awscdk.services.s3.Location.Builder)
      .objectKey(objectKey.orNull)
      .bucketName(bucketName.orNull)
      .objectVersion(objectVersion.orNull)
      .build()
}
