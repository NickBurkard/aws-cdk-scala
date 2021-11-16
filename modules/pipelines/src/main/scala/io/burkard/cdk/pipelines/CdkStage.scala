package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CdkStage {

  def apply(
    internalResourceId: String,
    host: software.amazon.awscdk.pipelines.IStageHost,
    cloudAssemblyArtifact: software.amazon.awscdk.services.codepipeline.Artifact,
    stageName: String,
    pipelineStage: software.amazon.awscdk.services.codepipeline.IStage,
    confirmBroadeningPermissions: Option[Boolean] = None,
    securityNotificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.pipelines.CdkStage =
    software.amazon.awscdk.pipelines.CdkStage.Builder
      .create(stackCtx, internalResourceId)
      .host(host)
      .cloudAssemblyArtifact(cloudAssemblyArtifact)
      .stageName(stageName)
      .pipelineStage(pipelineStage)
      .confirmBroadeningPermissions(confirmBroadeningPermissions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityNotificationTopic(securityNotificationTopic.orNull)
      .build()
}
