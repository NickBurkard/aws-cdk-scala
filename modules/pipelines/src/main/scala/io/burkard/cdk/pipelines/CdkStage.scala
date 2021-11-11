package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CdkStage {

  def apply(
    internalResourceId: String,
    host: Option[software.amazon.awscdk.pipelines.IStageHost] = None,
    cloudAssemblyArtifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    stageName: Option[String] = None,
    confirmBroadeningPermissions: Option[Boolean] = None,
    pipelineStage: Option[software.amazon.awscdk.services.codepipeline.IStage] = None,
    securityNotificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.pipelines.CdkStage =
    software.amazon.awscdk.pipelines.CdkStage.Builder
      .create(stackCtx, internalResourceId)
      .host(host.orNull)
      .cloudAssemblyArtifact(cloudAssemblyArtifact.orNull)
      .stageName(stageName.orNull)
      .confirmBroadeningPermissions(confirmBroadeningPermissions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .pipelineStage(pipelineStage.orNull)
      .securityNotificationTopic(securityNotificationTopic.orNull)
      .build()
}
