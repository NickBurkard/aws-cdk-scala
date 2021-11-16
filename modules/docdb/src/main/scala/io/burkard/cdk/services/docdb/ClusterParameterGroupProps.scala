package io.burkard.cdk.services.docdb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterParameterGroupProps {

  def apply(
    family: String,
    parameters: Map[String, String],
    description: Option[String] = None,
    dbClusterParameterGroupName: Option[String] = None
  ): software.amazon.awscdk.services.docdb.ClusterParameterGroupProps =
    (new software.amazon.awscdk.services.docdb.ClusterParameterGroupProps.Builder)
      .family(family)
      .parameters(parameters.asJava)
      .description(description.orNull)
      .dbClusterParameterGroupName(dbClusterParameterGroupName.orNull)
      .build()
}
