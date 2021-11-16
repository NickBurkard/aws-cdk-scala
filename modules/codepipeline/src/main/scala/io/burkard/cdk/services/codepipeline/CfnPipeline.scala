package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPipeline {

  def apply(
    internalResourceId: String,
    stages: List[_],
    roleArn: String,
    restartExecutionOnUpdate: Option[Boolean] = None,
    name: Option[String] = None,
    disableInboundStageTransitions: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    artifactStore: Option[software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty] = None,
    artifactStores: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codepipeline.CfnPipeline =
    software.amazon.awscdk.services.codepipeline.CfnPipeline.Builder
      .create(stackCtx, internalResourceId)
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
