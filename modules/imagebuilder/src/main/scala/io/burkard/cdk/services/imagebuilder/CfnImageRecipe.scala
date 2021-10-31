package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnImageRecipe {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    components: Option[List[_]] = None,
    version: Option[String] = None,
    workingDirectory: Option[String] = None,
    additionalInstanceConfiguration: Option[software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty] = None,
    parentImage: Option[String] = None,
    blockDeviceMappings: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.imagebuilder.CfnImageRecipe =
    software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.Builder
      .create(stackCtx, internalResourceId)
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
