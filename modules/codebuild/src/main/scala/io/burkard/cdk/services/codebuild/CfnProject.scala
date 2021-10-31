package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProject {

  def apply(
    internalResourceId: String,
    artifacts: Option[software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty] = None,
    name: Option[String] = None,
    source: Option[software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty] = None,
    serviceRole: Option[String] = None,
    logsConfig: Option[software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty] = None,
    secondarySourceVersions: Option[List[_]] = None,
    vpcConfig: Option[software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty] = None,
    badgeEnabled: Option[Boolean] = None,
    triggers: Option[software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty] = None,
    concurrentBuildLimit: Option[Number] = None,
    fileSystemLocations: Option[List[_]] = None,
    encryptionKey: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    cache: Option[software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty] = None,
    buildBatchConfig: Option[software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty] = None,
    resourceAccessRole: Option[String] = None,
    environment: Option[software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty] = None,
    secondarySources: Option[List[_]] = None,
    secondaryArtifacts: Option[List[_]] = None,
    queuedTimeoutInMinutes: Option[Number] = None,
    sourceVersion: Option[String] = None,
    timeoutInMinutes: Option[Number] = None,
    visibility: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.CfnProject =
    software.amazon.awscdk.services.codebuild.CfnProject.Builder
      .create(stackCtx, internalResourceId)
      .artifacts(artifacts.orNull)
      .name(name.orNull)
      .source(source.orNull)
      .serviceRole(serviceRole.orNull)
      .logsConfig(logsConfig.orNull)
      .secondarySourceVersions(secondarySourceVersions.map(_.asJava).orNull)
      .vpcConfig(vpcConfig.orNull)
      .badgeEnabled(badgeEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .triggers(triggers.orNull)
      .concurrentBuildLimit(concurrentBuildLimit.orNull)
      .fileSystemLocations(fileSystemLocations.map(_.asJava).orNull)
      .encryptionKey(encryptionKey.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .cache(cache.orNull)
      .buildBatchConfig(buildBatchConfig.orNull)
      .resourceAccessRole(resourceAccessRole.orNull)
      .environment(environment.orNull)
      .secondarySources(secondarySources.map(_.asJava).orNull)
      .secondaryArtifacts(secondaryArtifacts.map(_.asJava).orNull)
      .queuedTimeoutInMinutes(queuedTimeoutInMinutes.orNull)
      .sourceVersion(sourceVersion.orNull)
      .timeoutInMinutes(timeoutInMinutes.orNull)
      .visibility(visibility.orNull)
      .build()
}
