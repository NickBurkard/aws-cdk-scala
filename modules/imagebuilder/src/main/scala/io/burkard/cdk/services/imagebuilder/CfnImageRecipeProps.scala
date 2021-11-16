package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnImageRecipeProps {

  def apply(
    name: String,
    components: List[_],
    version: String,
    parentImage: String,
    workingDirectory: Option[String] = None,
    additionalInstanceConfiguration: Option[software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty] = None,
    blockDeviceMappings: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps =
    (new software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps.Builder)
      .name(name)
      .components(components.asJava)
      .version(version)
      .parentImage(parentImage)
      .workingDirectory(workingDirectory.orNull)
      .additionalInstanceConfiguration(additionalInstanceConfiguration.orNull)
      .blockDeviceMappings(blockDeviceMappings.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
