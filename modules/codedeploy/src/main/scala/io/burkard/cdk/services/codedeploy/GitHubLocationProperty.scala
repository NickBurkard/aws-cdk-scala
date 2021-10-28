package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
