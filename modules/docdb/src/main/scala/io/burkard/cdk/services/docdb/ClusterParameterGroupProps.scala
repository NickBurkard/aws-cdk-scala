package io.burkard.cdk.services.docdb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
