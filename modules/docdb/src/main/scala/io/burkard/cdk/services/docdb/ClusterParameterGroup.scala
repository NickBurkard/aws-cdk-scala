package io.burkard.cdk.services.docdb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterParameterGroup {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    dbClusterParameterGroupName: Option[String] = None,
    family: Option[String] = None,
    parameters: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.docdb.ClusterParameterGroup =
    software.amazon.awscdk.services.docdb.ClusterParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .dbClusterParameterGroupName(dbClusterParameterGroupName.orNull)
      .family(family.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
