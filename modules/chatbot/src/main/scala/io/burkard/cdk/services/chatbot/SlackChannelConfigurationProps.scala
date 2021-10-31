package io.burkard.cdk.services.chatbot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SlackChannelConfigurationProps {

  def apply(
    logRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    notificationTopics: Option[List[_ <: software.amazon.awscdk.services.sns.ITopic]] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    slackChannelId: Option[String] = None,
    loggingLevel: Option[software.amazon.awscdk.services.chatbot.LoggingLevel] = None,
    slackWorkspaceId: Option[String] = None,
    slackChannelConfigurationName: Option[String] = None,
    logRetentionRetryOptions: Option[software.amazon.awscdk.services.logs.LogRetentionRetryOptions] = None,
    logRetentionRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps =
    (new software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps.Builder)
      .logRetention(logRetention.orNull)
      .notificationTopics(notificationTopics.map(_.asJava).orNull)
      .role(role.orNull)
      .slackChannelId(slackChannelId.orNull)
      .loggingLevel(loggingLevel.orNull)
      .slackWorkspaceId(slackWorkspaceId.orNull)
      .slackChannelConfigurationName(slackChannelConfigurationName.orNull)
      .logRetentionRetryOptions(logRetentionRetryOptions.orNull)
      .logRetentionRole(logRetentionRole.orNull)
      .build()
}
