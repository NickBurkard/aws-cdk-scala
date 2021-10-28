package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingProperty {

  def apply(
    prefix: Option[String] = None,
    enabled: Option[Boolean] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder)
      .prefix(prefix.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bucket(bucket.orNull)
      .build()
}
