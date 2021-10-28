package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UpdatePipelineActionProps {

  def apply(
    projectName: Option[String] = None,
    pipelineStackHierarchicalId: Option[String] = None,
    buildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None,
    dockerCredentials: Option[List[_ <: software.amazon.awscdk.pipelines.DockerCredential]] = None,
    privileged: Option[Boolean] = None,
    cloudAssemblyInput: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    cdkCliVersion: Option[String] = None
  ): software.amazon.awscdk.pipelines.UpdatePipelineActionProps =
    (new software.amazon.awscdk.pipelines.UpdatePipelineActionProps.Builder)
      .projectName(projectName.orNull)
      .pipelineStackHierarchicalId(pipelineStackHierarchicalId.orNull)
      .buildSpec(buildSpec.orNull)
      .dockerCredentials(dockerCredentials.map(_.asJava).orNull)
      .privileged(privileged.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudAssemblyInput(cloudAssemblyInput.orNull)
      .cdkCliVersion(cdkCliVersion.orNull)
      .build()
}
