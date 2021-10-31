package io.burkard.cdk.services.aps

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWorkspaceProps {

  def apply(
    alertManagerDefinition: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    alias: Option[String] = None
  ): software.amazon.awscdk.services.aps.CfnWorkspaceProps =
    (new software.amazon.awscdk.services.aps.CfnWorkspaceProps.Builder)
      .alertManagerDefinition(alertManagerDefinition.orNull)
      .tags(tags.map(_.asJava).orNull)
      .alias(alias.orNull)
      .build()
}
