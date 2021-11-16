package io.burkard.cdk.services.neptune

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBClusterParameterGroup {

  def apply(
    internalResourceId: String,
    family: String,
    parameters: AnyRef,
    description: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroup =
    software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .family(family)
      .parameters(parameters)
      .description(description)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
