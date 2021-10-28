package io.burkard.cdk.services.redshift

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClusterParameterGroupProps {

  def apply(
    parameters: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    parameterGroupFamily: Option[String] = None
  ): software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps =
    (new software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder)
      .parameters(parameters.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .parameterGroupFamily(parameterGroupFamily.orNull)
      .build()
}
