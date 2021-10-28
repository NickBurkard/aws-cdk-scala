package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingConfiguration {

  def apply(
    prefix: Option[String] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    includeCookies: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.LoggingConfiguration =
    (new software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder)
      .prefix(prefix.orNull)
      .bucket(bucket.orNull)
      .includeCookies(includeCookies.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
