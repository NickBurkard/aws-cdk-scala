package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingProperty {

  def apply(
    prefix: Option[String] = None,
    bucket: Option[String] = None,
    includeCookies: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder)
      .prefix(prefix.orNull)
      .bucket(bucket.orNull)
      .includeCookies(includeCookies.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
