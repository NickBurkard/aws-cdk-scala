package io.burkard.cdk.services.docdb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
