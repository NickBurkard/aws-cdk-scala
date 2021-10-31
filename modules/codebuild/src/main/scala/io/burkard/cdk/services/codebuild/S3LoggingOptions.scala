package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LoggingOptions {

  def apply(
    prefix: Option[String] = None,
    enabled: Option[Boolean] = None,
    encrypted: Option[Boolean] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None
  ): software.amazon.awscdk.services.codebuild.S3LoggingOptions =
    (new software.amazon.awscdk.services.codebuild.S3LoggingOptions.Builder)
      .prefix(prefix.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bucket(bucket.orNull)
      .build()
}
