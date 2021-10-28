package io.burkard.cdk.services.ssmincidents

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ChatChannelProperty {

  def apply(
    chatbotSns: Option[List[String]] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty.Builder)
      .chatbotSns(chatbotSns.map(_.asJava).orNull)
      .build()
}
