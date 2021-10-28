package io.burkard.cdk.services.docdb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClusterParameterGroupProps {

  def apply(
    description: Option[String] = None,
    dbClusterParameterGroupName: Option[String] = None,
    family: Option[String] = None,
    parameters: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.docdb.ClusterParameterGroupProps =
    (new software.amazon.awscdk.services.docdb.ClusterParameterGroupProps.Builder)
      .description(description.orNull)
      .dbClusterParameterGroupName(dbClusterParameterGroupName.orNull)
      .family(family.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
