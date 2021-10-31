package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnImagePipeline {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    enhancedImageMetadataEnabled: Option[Boolean] = None,
    infrastructureConfigurationArn: Option[String] = None,
    imageRecipeArn: Option[String] = None,
    imageTestsConfiguration: Option[software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty] = None,
    status: Option[String] = None,
    schedule: Option[software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty] = None,
    distributionConfigurationArn: Option[String] = None,
    description: Option[String] = None,
    containerRecipeArn: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.imagebuilder.CfnImagePipeline =
    software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .enhancedImageMetadataEnabled(enhancedImageMetadataEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .infrastructureConfigurationArn(infrastructureConfigurationArn.orNull)
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
