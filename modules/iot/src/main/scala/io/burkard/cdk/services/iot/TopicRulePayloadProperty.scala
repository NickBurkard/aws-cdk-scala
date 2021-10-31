package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TopicRulePayloadProperty {

  def apply(
    description: Option[String] = None,
    errorAction: Option[software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty] = None,
    actions: Option[List[_]] = None,
    awsIotSqlVersion: Option[String] = None,
    sql: Option[String] = None,
    ruleDisabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder)
      .description(description.orNull)
      .errorAction(errorAction.orNull)
      .actions(actions.map(_.asJava).orNull)
      .awsIotSqlVersion(awsIotSqlVersion.orNull)
      .sql(sql.orNull)
      .ruleDisabled(ruleDisabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
