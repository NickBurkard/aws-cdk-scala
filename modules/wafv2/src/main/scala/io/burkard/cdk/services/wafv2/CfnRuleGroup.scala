package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRuleGroup {

  def apply(
    internalResourceId: String,
    capacity: Number,
    visibilityConfig: software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty,
    scope: String,
    customResponseBodies: Option[Map[String, _]] = None,
    rules: Option[List[_]] = None,
    name: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wafv2.CfnRuleGroup =
    software.amazon.awscdk.services.wafv2.CfnRuleGroup.Builder
      .create(stackCtx, internalResourceId)
      .capacity(capacity)
      .visibilityConfig(visibilityConfig)
      .scope(scope)
      .customResponseBodies(customResponseBodies.map(_.asJava).orNull)
      .rules(rules.map(_.asJava).orNull)
      .name(name.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
