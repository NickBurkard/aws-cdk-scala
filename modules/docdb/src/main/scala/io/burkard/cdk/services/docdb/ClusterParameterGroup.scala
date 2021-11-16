package io.burkard.cdk.services.docdb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterParameterGroup {

  def apply(
    internalResourceId: String,
    family: String,
    parameters: Map[String, String],
    description: Option[String] = None,
    dbClusterParameterGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.docdb.ClusterParameterGroup =
    software.amazon.awscdk.services.docdb.ClusterParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .family(family)
      .parameters(parameters.asJava)
      .description(description.orNull)
      .dbClusterParameterGroupName(dbClusterParameterGroupName.orNull)
      .build()
}
