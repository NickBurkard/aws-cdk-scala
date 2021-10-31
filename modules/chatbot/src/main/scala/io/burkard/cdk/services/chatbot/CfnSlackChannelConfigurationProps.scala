package io.burkard.cdk.services.chatbot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSlackChannelConfigurationProps {

  def apply(
    iamRoleArn: Option[String] = None,
    slackChannelId: Option[String] = None,
    loggingLevel: Option[String] = None,
    slackWorkspaceId: Option[String] = None,
    snsTopicArns: Option[List[String]] = None,
    configurationName: Option[String] = None
  ): software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps =
    (new software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps.Builder)
      .iamRoleArn(iamRoleArn.orNull)
      .slackChannelId(slackChannelId.orNull)
      .loggingLevel(loggingLevel.orNull)
      .slackWorkspaceId(slackWorkspaceId.orNull)
      .snsTopicArns(snsTopicArns.map(_.asJava).orNull)
      .configurationName(configurationName.orNull)
      .build()
}
