package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomActionTypeProps {

  def apply(
    provider: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    configurationProperties: Option[List[_]] = None,
    version: Option[String] = None,
    outputArtifactDetails: Option[software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty] = None,
    settings: Option[software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty] = None,
    category: Option[String] = None,
    inputArtifactDetails: Option[software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty] = None
  ): software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps =
    (new software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder)
      .provider(provider.orNull)
      .tags(tags.map(_.asJava).orNull)
      .configurationProperties(configurationProperties.map(_.asJava).orNull)
      .version(version.orNull)
      .outputArtifactDetails(outputArtifactDetails.orNull)
      .settings(settings.orNull)
      .category(category.orNull)
      .inputArtifactDetails(inputArtifactDetails.orNull)
      .build()
}
