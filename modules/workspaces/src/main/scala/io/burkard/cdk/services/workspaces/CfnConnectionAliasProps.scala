package io.burkard.cdk.services.workspaces

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnectionAliasProps {

  def apply(
    connectionString: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps =
    (new software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps.Builder)
      .connectionString(connectionString)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
