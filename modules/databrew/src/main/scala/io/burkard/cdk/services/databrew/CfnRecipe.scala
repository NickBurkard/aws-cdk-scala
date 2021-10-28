package io.burkard.cdk.services.databrew

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRecipe {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    steps: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.databrew.CfnRecipe =
    software.amazon.awscdk.services.databrew.CfnRecipe.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .steps(steps.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
