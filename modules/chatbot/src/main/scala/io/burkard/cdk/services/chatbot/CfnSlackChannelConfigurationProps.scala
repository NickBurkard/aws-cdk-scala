package io.burkard.cdk.services.chatbot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSlackChannelConfigurationProps {

  def apply(
    iamRoleArn: String,
    slackChannelId: String,
    slackWorkspaceId: String,
    configurationName: String,
    guardrailPolicies: Option[List[String]] = None,
    loggingLevel: Option[String] = None,
    snsTopicArns: Option[List[String]] = None,
    userRoleRequired: Option[Boolean] = None
  ): software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps =
    (new software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps.Builder)
      .iamRoleArn(iamRoleArn)
      .slackChannelId(slackChannelId)
      .slackWorkspaceId(slackWorkspaceId)
      .configurationName(configurationName)
      .guardrailPolicies(guardrailPolicies.map(_.asJava).orNull)
      .loggingLevel(loggingLevel.orNull)
      .snsTopicArns(snsTopicArns.map(_.asJava).orNull)
      .userRoleRequired(userRoleRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
