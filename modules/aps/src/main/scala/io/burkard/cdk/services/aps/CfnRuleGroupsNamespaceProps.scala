package io.burkard.cdk.services.aps

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRuleGroupsNamespaceProps {

  def apply(
    name: String,
    data: String,
    workspace: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps =
    (new software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps.Builder)
      .name(name)
      .data(data)
      .workspace(workspace)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
