package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3Property {

  def apply(
    enabled: Boolean,
    prefix: Option[String] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.S3Property =
    (new software.amazon.awscdk.services.msk.CfnCluster.S3Property.Builder)
      .enabled(enabled)
      .prefix(prefix.orNull)
      .bucket(bucket.orNull)
      .build()
}
