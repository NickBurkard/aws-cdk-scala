package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRuleGroup {

  def apply(
    internalResourceId: String,
    customResponseBodies: Option[Map[String, _]] = None,
    rules: Option[List[_]] = None,
    capacity: Option[Number] = None,
    name: Option[String] = None,
    visibilityConfig: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty] = None,
    description: Option[String] = None,
    scope: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wafv2.CfnRuleGroup =
    software.amazon.awscdk.services.wafv2.CfnRuleGroup.Builder
      .create(stackCtx, internalResourceId)
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
