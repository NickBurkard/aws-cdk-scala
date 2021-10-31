package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InventoryDestination {

  def apply(
    prefix: Option[String] = None,
    bucketOwner: Option[String] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None
  ): software.amazon.awscdk.services.s3.InventoryDestination =
    (new software.amazon.awscdk.services.s3.InventoryDestination.Builder)
      .prefix(prefix.orNull)
      .bucketOwner(bucketOwner.orNull)
      .bucket(bucket.orNull)
      .build()
}
