package io.burkard.cdk.services.workspaces

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConnectionAlias {

  def apply(
    internalResourceId: String,
    connectionString: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.workspaces.CfnConnectionAlias =
    software.amazon.awscdk.services.workspaces.CfnConnectionAlias.Builder
      .create(stackCtx, internalResourceId)
      .connectionString(connectionString.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
