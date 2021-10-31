package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceConfigurationProperty {

  def apply(
    image: Option[String] = None,
    blockDeviceMappings: Option[List[_]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty.Builder)
      .image(image.orNull)
      .blockDeviceMappings(blockDeviceMappings.map(_.asJava).orNull)
      .build()
}
