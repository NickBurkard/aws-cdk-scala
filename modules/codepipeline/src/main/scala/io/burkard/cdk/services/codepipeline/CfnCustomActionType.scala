package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomActionType {

  def apply(
    internalResourceId: String,
    provider: String,
    version: String,
    outputArtifactDetails: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty,
    category: String,
    inputArtifactDetails: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    configurationProperties: Option[List[_]] = None,
    settings: Option[software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codepipeline.CfnCustomActionType =
    software.amazon.awscdk.services.codepipeline.CfnCustomActionType.Builder
      .create(stackCtx, internalResourceId)
      .provider(provider)
      .version(version)
      .outputArtifactDetails(outputArtifactDetails)
      .category(category)
      .inputArtifactDetails(inputArtifactDetails)
      .tags(tags.map(_.asJava).orNull)
      .configurationProperties(configurationProperties.map(_.asJava).orNull)
      .settings(settings.orNull)
      .build()
}
