package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnImageRecipeProps {

  def apply(
    name: Option[String] = None,
    components: Option[List[_]] = None,
    version: Option[String] = None,
    workingDirectory: Option[String] = None,
    additionalInstanceConfiguration: Option[software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty] = None,
    parentImage: Option[String] = None,
    blockDeviceMappings: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps =
    (new software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps.Builder)
      .name(name.orNull)
      .components(components.map(_.asJava).orNull)
      .version(version.orNull)
      .workingDirectory(workingDirectory.orNull)
      .additionalInstanceConfiguration(additionalInstanceConfiguration.orNull)
      .parentImage(parentImage.orNull)
      .blockDeviceMappings(blockDeviceMappings.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
