package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeCommitSourceVariables {

  def apply(
    repositoryName: Option[String] = None,
    commitId: Option[String] = None,
    authorDate: Option[String] = None,
    committerDate: Option[String] = None,
    branchName: Option[String] = None,
    commitMessage: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables =
    (new software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables.Builder)
      .repositoryName(repositoryName.orNull)
      .commitId(commitId.orNull)
      .authorDate(authorDate.orNull)
      .committerDate(committerDate.orNull)
      .branchName(branchName.orNull)
      .commitMessage(commitMessage.orNull)
      .build()
}
