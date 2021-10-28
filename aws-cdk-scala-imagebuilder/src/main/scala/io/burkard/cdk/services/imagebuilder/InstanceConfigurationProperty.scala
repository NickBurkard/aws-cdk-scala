package io.burkard.cdk.services.imagebuilder

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
