package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTopicRule {

  def apply(
    internalResourceId: String,
    ruleName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    topicRulePayload: Option[software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnTopicRule =
    software.amazon.awscdk.services.iot.CfnTopicRule.Builder
      .create(stackCtx, internalResourceId)
      .ruleName(ruleName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .topicRulePayload(topicRulePayload.orNull)
      .build()
}
