package io.burkard.cdk.services.chatbot

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSlackChannelConfiguration {

  def apply(
    internalResourceId: String,
    iamRoleArn: Option[String] = None,
    slackChannelId: Option[String] = None,
    loggingLevel: Option[String] = None,
    slackWorkspaceId: Option[String] = None,
    snsTopicArns: Option[List[String]] = None,
    configurationName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration =
    software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .iamRoleArn(iamRoleArn.orNull)
      .slackChannelId(slackChannelId.orNull)
      .loggingLevel(loggingLevel.orNull)
      .slackWorkspaceId(slackWorkspaceId.orNull)
      .snsTopicArns(snsTopicArns.map(_.asJava).orNull)
      .configurationName(configurationName.orNull)
      .build()
}
