package io.burkard.cdk.services.aps

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
