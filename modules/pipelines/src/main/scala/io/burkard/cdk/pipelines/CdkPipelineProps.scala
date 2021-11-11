package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CdkPipelineProps {

  def apply(
    cloudAssemblyArtifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    crossAccountKeys: Option[Boolean] = None,
    supportDockerAssets: Option[Boolean] = None,
    pipelineName: Option[String] = None,
    cdkCliVersion: Option[String] = None,
    codePipeline: Option[software.amazon.awscdk.services.codepipeline.Pipeline] = None,
    assetPreInstallCommands: Option[List[String]] = None,
    selfMutationBuildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    enableKeyRotation: Option[Boolean] = None,
    sourceAction: Option[software.amazon.awscdk.services.codepipeline.IAction] = None,
    synthAction: Option[software.amazon.awscdk.services.codepipeline.IAction] = None,
    assetBuildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    singlePublisherPerType: Option[Boolean] = None,
    dockerCredentials: Option[List[_ <: software.amazon.awscdk.pipelines.DockerCredential]] = None,
    selfMutating: Option[Boolean] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.pipelines.CdkPipelineProps =
    (new software.amazon.awscdk.pipelines.CdkPipelineProps.Builder)
      .cloudAssemblyArtifact(cloudAssemblyArtifact.orNull)
      .crossAccountKeys(crossAccountKeys.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .supportDockerAssets(supportDockerAssets.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .pipelineName(pipelineName.orNull)
      .cdkCliVersion(cdkCliVersion.orNull)
      .codePipeline(codePipeline.orNull)
      .assetPreInstallCommands(assetPreInstallCommands.map(_.asJava).orNull)
      .selfMutationBuildSpec(selfMutationBuildSpec.orNull)
      .enableKeyRotation(enableKeyRotation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceAction(sourceAction.orNull)
      .synthAction(synthAction.orNull)
      .assetBuildSpec(assetBuildSpec.orNull)
      .subnetSelection(subnetSelection.orNull)
      .singlePublisherPerType(singlePublisherPerType.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dockerCredentials(dockerCredentials.map(_.asJava).orNull)
      .selfMutating(selfMutating.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpc(vpc.orNull)
      .build()
}
