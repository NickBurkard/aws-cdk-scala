package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnImage {

  def apply(
    internalResourceId: String,
    enhancedImageMetadataEnabled: Option[Boolean] = None,
    infrastructureConfigurationArn: Option[String] = None,
    imageRecipeArn: Option[String] = None,
    imageTestsConfiguration: Option[software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty] = None,
    distributionConfigurationArn: Option[String] = None,
    containerRecipeArn: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.imagebuilder.CfnImage =
    software.amazon.awscdk.services.imagebuilder.CfnImage.Builder
      .create(stackCtx, internalResourceId)
      .enhancedImageMetadataEnabled(enhancedImageMetadataEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .infrastructureConfigurationArn(infrastructureConfigurationArn.orNull)
      .imageRecipeArn(imageRecipeArn.orNull)
      .imageTestsConfiguration(imageTestsConfiguration.orNull)
      .distributionConfigurationArn(distributionConfigurationArn.orNull)
      .containerRecipeArn(containerRecipeArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
