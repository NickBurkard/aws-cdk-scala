package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPipelineProps {

  def apply(
    stages: List[_],
    roleArn: String,
    restartExecutionOnUpdate: Option[Boolean] = None,
    name: Option[String] = None,
    disableInboundStageTransitions: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    artifactStore: Option[software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty] = None,
    artifactStores: Option[List[_]] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipelineProps =
    (new software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder)
      .stages(stages.asJava)
      .roleArn(roleArn)
      .restartExecutionOnUpdate(restartExecutionOnUpdate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .name(name.orNull)
      .disableInboundStageTransitions(disableInboundStageTransitions.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .artifactStore(artifactStore.orNull)
      .artifactStores(artifactStores.map(_.asJava).orNull)
      .build()
}
