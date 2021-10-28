package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SourceProperty {

  def apply(
    gitSubmodulesConfig: Option[software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty] = None,
    location: Option[String] = None,
    reportBuildStatus: Option[Boolean] = None,
    auth: Option[software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty] = None,
    insecureSsl: Option[Boolean] = None,
    buildSpec: Option[String] = None,
    gitCloneDepth: Option[Number] = None,
    buildStatusConfig: Option[software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty] = None,
    `type`: Option[String] = None,
    sourceIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder)
      .gitSubmodulesConfig(gitSubmodulesConfig.orNull)
      .location(location.orNull)
      .reportBuildStatus(reportBuildStatus.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .auth(auth.orNull)
      .insecureSsl(insecureSsl.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .buildSpec(buildSpec.orNull)
      .gitCloneDepth(gitCloneDepth.orNull)
      .buildStatusConfig(buildStatusConfig.orNull)
      .`type`(`type`.orNull)
      .sourceIdentifier(sourceIdentifier.orNull)
      .build()
}
