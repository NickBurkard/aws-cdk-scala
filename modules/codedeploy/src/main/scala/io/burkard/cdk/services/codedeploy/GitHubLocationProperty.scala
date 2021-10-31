package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitHubLocationProperty {

  def apply(
    repository: Option[String] = None,
    commitId: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty.Builder)
      .repository(repository.orNull)
      .commitId(commitId.orNull)
      .build()
}
