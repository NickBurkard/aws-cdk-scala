package io.burkard.cdk.services.neptune

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBParameterGroup {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    family: Option[String] = None,
    parameters: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.neptune.CfnDBParameterGroup =
    software.amazon.awscdk.services.neptune.CfnDBParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .family(family.orNull)
      .parameters(parameters.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
