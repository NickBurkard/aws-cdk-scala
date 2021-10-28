package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPipeline {

  def apply(
    internalResourceId: String,
    restartExecutionOnUpdate: Option[Boolean] = None,
    stages: Option[List[_]] = None,
    name: Option[String] = None,
    disableInboundStageTransitions: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    artifactStore: Option[software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty] = None,
    roleArn: Option[String] = None,
    artifactStores: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codepipeline.CfnPipeline =
    software.amazon.awscdk.services.codepipeline.CfnPipeline.Builder
      .create(stackCtx, internalResourceId)
      .restartExecutionOnUpdate(restartExecutionOnUpdate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stages(stages.map(_.asJava).orNull)
      .name(name.orNull)
      .disableInboundStageTransitions(disableInboundStageTransitions.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .artifactStore(artifactStore.orNull)
      .roleArn(roleArn.orNull)
      .artifactStores(artifactStores.map(_.asJava).orNull)
      .build()
}
