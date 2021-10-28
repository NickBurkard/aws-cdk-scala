package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GitHubSourceVariables {

  def apply(
    repositoryName: Option[String] = None,
    commitId: Option[String] = None,
    authorDate: Option[String] = None,
    branchName: Option[String] = None,
    commitMessage: Option[String] = None,
    committerDate: Option[String] = None,
    commitUrl: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.GitHubSourceVariables =
    (new software.amazon.awscdk.services.codepipeline.actions.GitHubSourceVariables.Builder)
      .repositoryName(repositoryName.orNull)
      .commitId(commitId.orNull)
      .authorDate(authorDate.orNull)
      .branchName(branchName.orNull)
      .commitMessage(commitMessage.orNull)
      .committerDate(committerDate.orNull)
      .commitUrl(commitUrl.orNull)
      .build()
}
