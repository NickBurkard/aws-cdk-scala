package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingProperty {

  def apply(
    bucket: String,
    prefix: Option[String] = None,
    includeCookies: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder)
      .bucket(bucket)
      .prefix(prefix.orNull)
      .includeCookies(includeCookies.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
