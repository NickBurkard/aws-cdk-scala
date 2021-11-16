package io.burkard.cdk.services.docdb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBClusterParameterGroupProps {

  def apply(
    family: String,
    parameters: AnyRef,
    description: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps =
    (new software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder)
      .family(family)
      .parameters(parameters)
      .description(description)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
