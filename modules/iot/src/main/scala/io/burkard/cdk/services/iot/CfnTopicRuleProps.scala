package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTopicRuleProps {

  def apply(
    topicRulePayload: software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty,
    ruleName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRuleProps =
    (new software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder)
      .topicRulePayload(topicRulePayload)
      .ruleName(ruleName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
