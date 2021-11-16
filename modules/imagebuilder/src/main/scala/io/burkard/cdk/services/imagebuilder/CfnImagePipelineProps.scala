package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnImagePipelineProps {

  def apply(
    name: String,
    infrastructureConfigurationArn: String,
    enhancedImageMetadataEnabled: Option[Boolean] = None,
    imageRecipeArn: Option[String] = None,
    imageTestsConfiguration: Option[software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty] = None,
    status: Option[String] = None,
    schedule: Option[software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty] = None,
    distributionConfigurationArn: Option[String] = None,
    description: Option[String] = None,
    containerRecipeArn: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps =
    (new software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps.Builder)
      .name(name)
      .infrastructureConfigurationArn(infrastructureConfigurationArn)
      .enhancedImageMetadataEnabled(enhancedImageMetadataEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .imageRecipeArn(imageRecipeArn.orNull)
      .imageTestsConfiguration(imageTestsConfiguration.orNull)
      .status(status.orNull)
      .schedule(schedule.orNull)
      .distributionConfigurationArn(distributionConfigurationArn.orNull)
      .description(description.orNull)
      .containerRecipeArn(containerRecipeArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
