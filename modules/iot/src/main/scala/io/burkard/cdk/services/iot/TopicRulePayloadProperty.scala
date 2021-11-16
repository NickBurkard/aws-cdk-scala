package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TopicRulePayloadProperty {

  def apply(
    actions: List[_],
    sql: String,
    description: Option[String] = None,
    errorAction: Option[software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty] = None,
    awsIotSqlVersion: Option[String] = None,
    ruleDisabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder)
      .actions(actions.asJava)
      .sql(sql)
      .description(description.orNull)
      .errorAction(errorAction.orNull)
      .awsIotSqlVersion(awsIotSqlVersion.orNull)
      .ruleDisabled(ruleDisabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
