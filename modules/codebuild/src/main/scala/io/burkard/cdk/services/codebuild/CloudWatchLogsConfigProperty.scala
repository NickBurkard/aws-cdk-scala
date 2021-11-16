package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchLogsConfigProperty {

  def apply(
    status: String,
    streamName: Option[String] = None,
    groupName: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder)
      .status(status)
      .streamName(streamName.orNull)
      .groupName(groupName.orNull)
      .build()
}
