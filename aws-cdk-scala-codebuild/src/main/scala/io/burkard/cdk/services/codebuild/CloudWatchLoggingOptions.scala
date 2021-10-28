package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudWatchLoggingOptions {

  def apply(
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    prefix: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions =
    (new software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions.Builder)
      .logGroup(logGroup.orNull)
      .prefix(prefix.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
