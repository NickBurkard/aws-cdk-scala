package io.burkard.cdk.services.amplify

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBranch {

  def apply(
    internalResourceId: String,
    appId: String,
    branchName: String,
    enablePullRequestPreview: Option[Boolean] = None,
    stage: Option[String] = None,
    environmentVariables: Option[List[_]] = None,
    buildSpec: Option[String] = None,
    enableAutoBuild: Option[Boolean] = None,
    pullRequestEnvironmentName: Option[String] = None,
    basicAuthConfig: Option[software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty] = None,
    enablePerformanceMode: Option[Boolean] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.amplify.CfnBranch =
    software.amazon.awscdk.services.amplify.CfnBranch.Builder
      .create(stackCtx, internalResourceId)
      .appId(appId)
      .branchName(branchName)
      .enablePullRequestPreview(enablePullRequestPreview.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stage(stage.orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .buildSpec(buildSpec.orNull)
      .enableAutoBuild(enableAutoBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .pullRequestEnvironmentName(pullRequestEnvironmentName.orNull)
      .basicAuthConfig(basicAuthConfig.orNull)
      .enablePerformanceMode(enablePerformanceMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
