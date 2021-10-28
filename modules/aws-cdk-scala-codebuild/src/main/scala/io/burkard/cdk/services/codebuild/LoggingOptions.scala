package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingOptions {

  def apply(
    s3: Option[software.amazon.awscdk.services.codebuild.S3LoggingOptions] = None,
    cloudWatch: Option[software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions] = None
  ): software.amazon.awscdk.services.codebuild.LoggingOptions =
    (new software.amazon.awscdk.services.codebuild.LoggingOptions.Builder)
      .s3(s3.orNull)
      .cloudWatch(cloudWatch.orNull)
      .build()
}
