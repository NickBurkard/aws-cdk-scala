package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBClusterParameterGroupProps {

  def apply(
    family: Option[String] = None,
    parameters: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps =
    (new software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps.Builder)
      .family(family.orNull)
      .parameters(parameters.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
