package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBParameterGroupProps {

  def apply(
    family: String,
    description: String,
    parameters: Option[Map[String, String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.rds.CfnDBParameterGroupProps =
    (new software.amazon.awscdk.services.rds.CfnDBParameterGroupProps.Builder)
      .family(family)
      .description(description)
      .parameters(parameters.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
