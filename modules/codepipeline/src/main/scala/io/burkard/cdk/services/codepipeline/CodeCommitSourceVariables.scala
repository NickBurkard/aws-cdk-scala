package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeCommitSourceVariables {

  def apply(
    repositoryName: String,
    commitId: String,
    authorDate: String,
    committerDate: String,
    branchName: String,
    commitMessage: String
  ): software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables =
    (new software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables.Builder)
      .repositoryName(repositoryName)
      .commitId(commitId)
      .authorDate(authorDate)
      .committerDate(committerDate)
      .branchName(branchName)
      .commitMessage(commitMessage)
      .build()
}
