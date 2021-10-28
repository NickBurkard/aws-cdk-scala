package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRuleGroupProps {

  def apply(
    customResponseBodies: Option[Map[String, _]] = None,
    rules: Option[List[_]] = None,
    capacity: Option[Number] = None,
    name: Option[String] = None,
    visibilityConfig: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty] = None,
    description: Option[String] = None,
    scope: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroupProps =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroupProps.Builder)
      .customResponseBodies(customResponseBodies.map(_.asJava).orNull)
      .rules(rules.map(_.asJava).orNull)
      .capacity(capacity.orNull)
      .name(name.orNull)
      .visibilityConfig(visibilityConfig.orNull)
      .description(description.orNull)
      .scope(scope.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
