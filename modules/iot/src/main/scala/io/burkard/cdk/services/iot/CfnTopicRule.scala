package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTopicRule {

  def apply(
    internalResourceId: String,
    topicRulePayload: software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty,
    ruleName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnTopicRule =
    software.amazon.awscdk.services.iot.CfnTopicRule.Builder
      .create(stackCtx, internalResourceId)
      .topicRulePayload(topicRulePayload)
      .ruleName(ruleName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
