package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3Property {

  def apply(
    prefix: Option[String] = None,
    enabled: Option[Boolean] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.S3Property =
    (new software.amazon.awscdk.services.msk.CfnCluster.S3Property.Builder)
      .prefix(prefix.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bucket(bucket.orNull)
      .build()
}
