package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodePipeline {

  def apply(
    internalResourceId: String,
    publishAssetsInParallel: Option[Boolean] = None,
    cliVersion: Option[String] = None,
    assetPublishingCodeBuildDefaults: Option[software.amazon.awscdk.pipelines.CodeBuildOptions] = None,
    selfMutation: Option[Boolean] = None,
    synth: Option[software.amazon.awscdk.pipelines.IFileSetProducer] = None,
    crossAccountKeys: Option[Boolean] = None,
    codeBuildDefaults: Option[software.amazon.awscdk.pipelines.CodeBuildOptions] = None,
    dockerCredentials: Option[List[_ <: software.amazon.awscdk.pipelines.DockerCredential]] = None,
    pipelineName: Option[String] = None,
    selfMutationCodeBuildDefaults: Option[software.amazon.awscdk.pipelines.CodeBuildOptions] = None,
    dockerEnabledForSynth: Option[Boolean] = None,
    codePipeline: Option[software.amazon.awscdk.services.codepipeline.Pipeline] = None,
    synthCodeBuildDefaults: Option[software.amazon.awscdk.pipelines.CodeBuildOptions] = None,
    dockerEnabledForSelfMutation: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.pipelines.CodePipeline =
    software.amazon.awscdk.pipelines.CodePipeline.Builder
      .create(stackCtx, internalResourceId)
      .publishAssetsInParallel(publishAssetsInParallel.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cliVersion(cliVersion.orNull)
      .assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults.orNull)
      .selfMutation(selfMutation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .synth(synth.orNull)
      .crossAccountKeys(crossAccountKeys.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .codeBuildDefaults(codeBuildDefaults.orNull)
      .dockerCredentials(dockerCredentials.map(_.asJava).orNull)
      .pipelineName(pipelineName.orNull)
      .selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults.orNull)
      .dockerEnabledForSynth(dockerEnabledForSynth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .codePipeline(codePipeline.orNull)
      .synthCodeBuildDefaults(synthCodeBuildDefaults.orNull)
      .dockerEnabledForSelfMutation(dockerEnabledForSelfMutation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
