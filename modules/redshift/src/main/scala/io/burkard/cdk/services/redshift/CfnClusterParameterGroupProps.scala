package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterParameterGroupProps {

  def apply(
    description: String,
    parameterGroupFamily: String,
    parameters: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps =
    (new software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder)
      .description(description)
      .parameterGroupFamily(parameterGroupFamily)
      .parameters(parameters.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
