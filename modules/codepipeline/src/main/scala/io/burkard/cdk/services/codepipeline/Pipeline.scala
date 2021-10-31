package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Pipeline {

  def apply(
    internalResourceId: String,
    restartExecutionOnUpdate: Option[Boolean] = None,
    stages: Option[List[_ <: software.amazon.awscdk.services.codepipeline.StageProps]] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    artifactBucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    crossRegionReplicationBuckets: Option[Map[String, _ <: software.amazon.awscdk.services.s3.IBucket]] = None,
    crossAccountKeys: Option[Boolean] = None,
    pipelineName: Option[String] = None,
    enableKeyRotation: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codepipeline.Pipeline =
    software.amazon.awscdk.services.codepipeline.Pipeline.Builder
      .create(stackCtx, internalResourceId)
      .restartExecutionOnUpdate(restartExecutionOnUpdate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stages(stages.map(_.asJava).orNull)
      .role(role.orNull)
      .artifactBucket(artifactBucket.orNull)
      .crossRegionReplicationBuckets(crossRegionReplicationBuckets.map(_.asJava).orNull)
      .crossAccountKeys(crossAccountKeys.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .pipelineName(pipelineName.orNull)
      .enableKeyRotation(enableKeyRotation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
