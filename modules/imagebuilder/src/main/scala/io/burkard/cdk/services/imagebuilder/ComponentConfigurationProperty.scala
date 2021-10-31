package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ComponentConfigurationProperty {

  def apply(
    componentArn: Option[String] = None,
    parameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty.Builder)
      .componentArn(componentArn.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
