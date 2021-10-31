package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
