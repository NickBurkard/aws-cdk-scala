package io.burkard.cdk.services.amplify

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoBranchCreationConfigProperty {

  def apply(
    enablePullRequestPreview: Option[Boolean] = None,
    stage: Option[String] = None,
    environmentVariables: Option[List[_]] = None,
    buildSpec: Option[String] = None,
    autoBranchCreationPatterns: Option[List[String]] = None,
    enableAutoBuild: Option[Boolean] = None,
    pullRequestEnvironmentName: Option[String] = None,
    enableAutoBranchCreation: Option[Boolean] = None,
    basicAuthConfig: Option[software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty] = None,
    enablePerformanceMode: Option[Boolean] = None
  ): software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty =
    (new software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty.Builder)
      .enablePullRequestPreview(enablePullRequestPreview.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stage(stage.orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .buildSpec(buildSpec.orNull)
      .autoBranchCreationPatterns(autoBranchCreationPatterns.map(_.asJava).orNull)
      .enableAutoBuild(enableAutoBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .pullRequestEnvironmentName(pullRequestEnvironmentName.orNull)
      .enableAutoBranchCreation(enableAutoBranchCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .basicAuthConfig(basicAuthConfig.orNull)
      .enablePerformanceMode(enablePerformanceMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
