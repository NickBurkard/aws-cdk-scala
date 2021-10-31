package io.burkard.cdk.services.cloudtrail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3EventSelector {

  def apply(
    objectPrefix: Option[String] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None
  ): software.amazon.awscdk.services.cloudtrail.S3EventSelector =
    (new software.amazon.awscdk.services.cloudtrail.S3EventSelector.Builder)
      .objectPrefix(objectPrefix.orNull)
      .bucket(bucket.orNull)
      .build()
}
