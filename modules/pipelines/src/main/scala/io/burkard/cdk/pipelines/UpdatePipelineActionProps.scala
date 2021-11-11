package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UpdatePipelineActionProps {

  def apply(
    projectName: Option[String] = None,
    pipelineStackHierarchicalId: Option[String] = None,
    dockerCredentials: Option[List[_ <: software.amazon.awscdk.pipelines.DockerCredential]] = None,
    privileged: Option[Boolean] = None,
    buildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    pipelineStackName: Option[String] = None,
    cloudAssemblyInput: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    cdkCliVersion: Option[String] = None
  ): software.amazon.awscdk.pipelines.UpdatePipelineActionProps =
    (new software.amazon.awscdk.pipelines.UpdatePipelineActionProps.Builder)
      .projectName(projectName.orNull)
      .pipelineStackHierarchicalId(pipelineStackHierarchicalId.orNull)
      .dockerCredentials(dockerCredentials.map(_.asJava).orNull)
      .privileged(privileged.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .buildSpec(buildSpec.orNull)
      .pipelineStackName(pipelineStackName.orNull)
      .cloudAssemblyInput(cloudAssemblyInput.orNull)
      .cdkCliVersion(cdkCliVersion.orNull)
      .build()
}
