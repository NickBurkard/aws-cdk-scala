package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWebACLProps {

  def apply(
    defaultAction: software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty,
    visibilityConfig: software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty,
    scope: String,
    customResponseBodies: Option[Map[String, _]] = None,
    rules: Option[List[_]] = None,
    name: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACLProps =
    (new software.amazon.awscdk.services.wafv2.CfnWebACLProps.Builder)
      .defaultAction(defaultAction)
      .visibilityConfig(visibilityConfig)
      .scope(scope)
      .customResponseBodies(customResponseBodies.map(_.asJava).orNull)
      .rules(rules.map(_.asJava).orNull)
      .name(name.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
