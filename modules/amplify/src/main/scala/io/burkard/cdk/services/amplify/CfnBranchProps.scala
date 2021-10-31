package io.burkard.cdk.services.amplify

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBranchProps {

  def apply(
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
  ): software.amazon.awscdk.services.amplify.CfnBranchProps =
    (new software.amazon.awscdk.services.amplify.CfnBranchProps.Builder)
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
