package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRecipe {

  def apply(
    internalResourceId: String,
    name: String,
    steps: List[_],
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.databrew.CfnRecipe =
    software.amazon.awscdk.services.databrew.CfnRecipe.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .steps(steps.asJava)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
