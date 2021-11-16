package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitHubSourceVariables {

  def apply(
    repositoryName: String,
    commitId: String,
    authorDate: String,
    branchName: String,
    commitMessage: String,
    committerDate: String,
    commitUrl: String
  ): software.amazon.awscdk.services.codepipeline.actions.GitHubSourceVariables =
    (new software.amazon.awscdk.services.codepipeline.actions.GitHubSourceVariables.Builder)
      .repositoryName(repositoryName)
      .commitId(commitId)
      .authorDate(authorDate)
      .branchName(branchName)
      .commitMessage(commitMessage)
      .committerDate(committerDate)
      .commitUrl(commitUrl)
      .build()
}
