package io.burkard.cdk.services.neptune

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBParameterGroupProps {

  def apply(
    family: String,
    parameters: AnyRef,
    description: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps =
    (new software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder)
      .family(family)
      .parameters(parameters)
      .description(description)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
