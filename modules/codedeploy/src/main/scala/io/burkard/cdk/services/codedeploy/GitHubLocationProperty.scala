package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitHubLocationProperty {

  def apply(
    repository: String,
    commitId: String
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty.Builder)
      .repository(repository)
      .commitId(commitId)
      .build()
}
