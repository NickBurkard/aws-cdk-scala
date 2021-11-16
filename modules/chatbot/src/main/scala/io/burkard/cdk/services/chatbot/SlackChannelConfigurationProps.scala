package io.burkard.cdk.services.chatbot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SlackChannelConfigurationProps {

  def apply(
    slackChannelId: String,
    slackWorkspaceId: String,
    slackChannelConfigurationName: String,
    logRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    notificationTopics: Option[List[_ <: software.amazon.awscdk.services.sns.ITopic]] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    loggingLevel: Option[software.amazon.awscdk.services.chatbot.LoggingLevel] = None,
    logRetentionRetryOptions: Option[software.amazon.awscdk.services.logs.LogRetentionRetryOptions] = None,
    logRetentionRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps =
    (new software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps.Builder)
      .slackChannelId(slackChannelId)
      .slackWorkspaceId(slackWorkspaceId)
      .slackChannelConfigurationName(slackChannelConfigurationName)
      .logRetention(logRetention.orNull)
      .notificationTopics(notificationTopics.map(_.asJava).orNull)
      .role(role.orNull)
      .loggingLevel(loggingLevel.orNull)
      .logRetentionRetryOptions(logRetentionRetryOptions.orNull)
      .logRetentionRole(logRetentionRole.orNull)
      .build()
}
