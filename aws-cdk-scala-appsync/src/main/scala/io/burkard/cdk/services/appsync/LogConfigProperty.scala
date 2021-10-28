package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogConfigProperty {

  def apply(
    excludeVerboseContent: Option[Boolean] = None,
    fieldLogLevel: Option[String] = None,
    cloudWatchLogsRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.Builder)
      .excludeVerboseContent(excludeVerboseContent.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .fieldLogLevel(fieldLogLevel.orNull)
      .cloudWatchLogsRoleArn(cloudWatchLogsRoleArn.orNull)
      .build()
}
