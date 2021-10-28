package io.burkard.cdk.services.workspaces

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConnectionAliasProps {

  def apply(
    connectionString: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps =
    (new software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps.Builder)
      .connectionString(connectionString.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
