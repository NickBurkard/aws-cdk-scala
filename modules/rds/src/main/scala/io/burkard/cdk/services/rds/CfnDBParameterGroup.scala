package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBParameterGroup {

  def apply(
    internalResourceId: String,
    family: Option[String] = None,
    parameters: Option[Map[String, String]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.CfnDBParameterGroup =
    software.amazon.awscdk.services.rds.CfnDBParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .family(family.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}