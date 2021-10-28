package io.burkard.cdk.services.imagebuilder

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnContainerRecipeProps {

  def apply(
    name: Option[String] = None,
    components: Option[List[_]] = None,
    dockerfileTemplateData: Option[String] = None,
    version: Option[String] = None,
    dockerfileTemplateUri: Option[String] = None,
    targetRepository: Option[software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty] = None,
    kmsKeyId: Option[String] = None,
    parentImage: Option[String] = None,
    imageOsVersionOverride: Option[String] = None,
    containerType: Option[String] = None,
    instanceConfiguration: Option[software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    platformOverride: Option[String] = None,
    workingDirectory: Option[String] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps =
    (new software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps.Builder)
      .name(name.orNull)
      .components(components.map(_.asJava).orNull)
      .dockerfileTemplateData(dockerfileTemplateData.orNull)
      .version(version.orNull)
      .dockerfileTemplateUri(dockerfileTemplateUri.orNull)
      .targetRepository(targetRepository.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .parentImage(parentImage.orNull)
      .imageOsVersionOverride(imageOsVersionOverride.orNull)
      .containerType(containerType.orNull)
      .instanceConfiguration(instanceConfiguration.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .platformOverride(platformOverride.orNull)
      .workingDirectory(workingDirectory.orNull)
      .build()
}
