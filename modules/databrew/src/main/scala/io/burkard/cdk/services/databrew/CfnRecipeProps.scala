package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRecipeProps {

  def apply(
    name: Option[String] = None,
    steps: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.databrew.CfnRecipeProps =
    (new software.amazon.awscdk.services.databrew.CfnRecipeProps.Builder)
      .name(name.orNull)
      .steps(steps.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
