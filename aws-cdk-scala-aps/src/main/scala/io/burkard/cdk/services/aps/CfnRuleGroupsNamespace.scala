package io.burkard.cdk.services.aps

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRuleGroupsNamespace {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    data: Option[String] = None,
    workspace: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace =
    software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .data(data.orNull)
      .workspace(workspace.orNull)
      .build()
}
