package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InventoryDestination {

  def apply(
    bucket: software.amazon.awscdk.services.s3.IBucket,
    prefix: Option[String] = None,
    bucketOwner: Option[String] = None
  ): software.amazon.awscdk.services.s3.InventoryDestination =
    (new software.amazon.awscdk.services.s3.InventoryDestination.Builder)
      .bucket(bucket)
      .prefix(prefix.orNull)
      .bucketOwner(bucketOwner.orNull)
      .build()
}
