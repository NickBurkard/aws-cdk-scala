package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogsConfigProperty {

  def apply(
    s3Logs: Option[software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty] = None,
    cloudWatchLogs: Option[software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.Builder)
      .s3Logs(s3Logs.orNull)
      .cloudWatchLogs(cloudWatchLogs.orNull)
      .build()
}
