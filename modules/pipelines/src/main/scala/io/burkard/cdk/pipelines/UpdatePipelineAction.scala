package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UpdatePipelineAction {

  def apply(
    internalResourceId: String,
    pipelineStackHierarchicalId: String,
    cloudAssemblyInput: software.amazon.awscdk.services.codepipeline.Artifact,
    projectName: Option[String] = None,
    dockerCredentials: Option[List[_ <: software.amazon.awscdk.pipelines.DockerCredential]] = None,
    privileged: Option[Boolean] = None,
    buildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    pipelineStackName: Option[String] = None,
    cdkCliVersion: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.pipelines.UpdatePipelineAction =
    software.amazon.awscdk.pipelines.UpdatePipelineAction.Builder
      .create(stackCtx, internalResourceId)
      .pipelineStackHierarchicalId(pipelineStackHierarchicalId)
      .cloudAssemblyInput(cloudAssemblyInput)
      .projectName(projectName.orNull)
      .dockerCredentials(dockerCredentials.map(_.asJava).orNull)
      .privileged(privileged.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .buildSpec(buildSpec.orNull)
      .pipelineStackName(pipelineStackName.orNull)
      .cdkCliVersion(cdkCliVersion.orNull)
      .build()
}
