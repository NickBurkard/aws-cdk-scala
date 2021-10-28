package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWebACL {

  def apply(
    internalResourceId: String,
    customResponseBodies: Option[Map[String, _]] = None,
    defaultAction: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty] = None,
    rules: Option[List[_]] = None,
    name: Option[String] = None,
    visibilityConfig: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty] = None,
    description: Option[String] = None,
    scope: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wafv2.CfnWebACL =
    software.amazon.awscdk.services.wafv2.CfnWebACL.Builder
      .create(stackCtx, internalResourceId)
      .customResponseBodies(customResponseBodies.map(_.asJava).orNull)
      .defaultAction(defaultAction.orNull)
      .rules(rules.map(_.asJava).orNull)
      .name(name.orNull)
      .visibilityConfig(visibilityConfig.orNull)
      .description(description.orNull)
      .scope(scope.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
