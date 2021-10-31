package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ComponentParameterProperty {

  def apply(
    name: Option[String] = None,
    value: Option[List[String]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty.Builder)
      .name(name.orNull)
      .value(value.map(_.asJava).orNull)
      .build()
}
