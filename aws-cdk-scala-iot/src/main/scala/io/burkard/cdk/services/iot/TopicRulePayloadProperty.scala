package io.burkard.cdk.services.iot

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
