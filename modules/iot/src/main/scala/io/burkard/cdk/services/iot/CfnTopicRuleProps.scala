package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTopicRuleProps {

  def apply(
    ruleName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    topicRulePayload: Option[software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRuleProps =
    (new software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder)
      .ruleName(ruleName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .topicRulePayload(topicRulePayload.orNull)
      .build()
}
