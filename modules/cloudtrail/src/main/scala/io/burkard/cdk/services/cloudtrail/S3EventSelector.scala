package io.burkard.cdk.services.cloudtrail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3EventSelector {

  def apply(
    bucket: software.amazon.awscdk.services.s3.IBucket,
    objectPrefix: Option[String] = None
  ): software.amazon.awscdk.services.cloudtrail.S3EventSelector =
    (new software.amazon.awscdk.services.cloudtrail.S3EventSelector.Builder)
      .bucket(bucket)
      .objectPrefix(objectPrefix.orNull)
      .build()
}
