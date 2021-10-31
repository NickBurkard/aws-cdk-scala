package io.burkard.cdk.services.chatbot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
