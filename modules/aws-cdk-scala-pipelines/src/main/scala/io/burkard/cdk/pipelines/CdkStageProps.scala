package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CdkStageProps {

  def apply(
    host: Option[software.amazon.awscdk.pipelines.IStageHost] = None,
    cloudAssemblyArtifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    stageName: Option[String] = None,
    confirmBroadeningPermissions: Option[Boolean] = None,
    pipelineStage: Option[software.amazon.awscdk.services.codepipeline.IStage] = None,
    securityNotificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.pipelines.CdkStageProps =
    (new software.amazon.awscdk.pipelines.CdkStageProps.Builder)
      .host(host.orNull)
      .cloudAssemblyArtifact(cloudAssemblyArtifact.orNull)
      .stageName(stageName.orNull)
      .confirmBroadeningPermissions(confirmBroadeningPermissions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .pipelineStage(pipelineStage.orNull)
      .securityNotificationTopic(securityNotificationTopic.orNull)
      .build()
}
