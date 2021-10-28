package io.burkard.cdk.services.amplify

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBranch {

  def apply(
    internalResourceId: String,
    enablePullRequestPreview: Option[Boolean] = None,
    stage: Option[String] = None,
    environmentVariables: Option[List[_]] = None,
    buildSpec: Option[String] = None,
    enableAutoBuild: Option[Boolean] = None,
    pullRequestEnvironmentName: Option[String] = None,
    basicAuthConfig: Option[software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty] = None,
    appId: Option[String] = None,
    branchName: Option[String] = None,
    enablePerformanceMode: Option[Boolean] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.amplify.CfnBranch =
    software.amazon.awscdk.services.amplify.CfnBranch.Builder
      .create(stackCtx, internalResourceId)
      .enablePullRequestPreview(enablePullRequestPreview.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stage(stage.orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .buildSpec(buildSpec.orNull)
      .enableAutoBuild(enableAutoBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .pullRequestEnvironmentName(pullRequestEnvironmentName.orNull)
      .basicAuthConfig(basicAuthConfig.orNull)
      .appId(appId.orNull)
      .branchName(branchName.orNull)
      .enablePerformanceMode(enablePerformanceMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
