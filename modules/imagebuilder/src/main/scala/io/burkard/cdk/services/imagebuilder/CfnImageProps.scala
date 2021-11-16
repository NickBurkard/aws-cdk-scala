package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnImageProps {

  def apply(
    infrastructureConfigurationArn: String,
    enhancedImageMetadataEnabled: Option[Boolean] = None,
    imageRecipeArn: Option[String] = None,
    imageTestsConfiguration: Option[software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty] = None,
    distributionConfigurationArn: Option[String] = None,
    containerRecipeArn: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImageProps =
    (new software.amazon.awscdk.services.imagebuilder.CfnImageProps.Builder)
      .infrastructureConfigurationArn(infrastructureConfigurationArn)
      .enhancedImageMetadataEnabled(enhancedImageMetadataEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .imageRecipeArn(imageRecipeArn.orNull)
      .imageTestsConfiguration(imageTestsConfiguration.orNull)
      .distributionConfigurationArn(distributionConfigurationArn.orNull)
      .containerRecipeArn(containerRecipeArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
