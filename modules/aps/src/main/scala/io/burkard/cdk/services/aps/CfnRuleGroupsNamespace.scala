package io.burkard.cdk.services.aps

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRuleGroupsNamespace {

  def apply(
    internalResourceId: String,
    data: String,
    workspace: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace =
    software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace.Builder
      .create(stackCtx, internalResourceId)
      .data(data)
      .workspace(workspace)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
