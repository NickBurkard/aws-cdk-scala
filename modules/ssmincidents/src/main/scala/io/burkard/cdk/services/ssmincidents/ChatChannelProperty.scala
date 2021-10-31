package io.burkard.cdk.services.ssmincidents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ChatChannelProperty {

  def apply(
    chatbotSns: Option[List[String]] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty.Builder)
      .chatbotSns(chatbotSns.map(_.asJava).orNull)
      .build()
}
