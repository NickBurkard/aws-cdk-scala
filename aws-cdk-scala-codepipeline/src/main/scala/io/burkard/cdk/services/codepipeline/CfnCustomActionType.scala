package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCustomActionType {

  def apply(
    internalResourceId: String,
    provider: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    configurationProperties: Option[List[_]] = None,
    version: Option[String] = None,
    outputArtifactDetails: Option[software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty] = None,
    settings: Option[software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty] = None,
    category: Option[String] = None,
    inputArtifactDetails: Option[software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codepipeline.CfnCustomActionType =
    software.amazon.awscdk.services.codepipeline.CfnCustomActionType.Builder
      .create(stackCtx, internalResourceId)
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
