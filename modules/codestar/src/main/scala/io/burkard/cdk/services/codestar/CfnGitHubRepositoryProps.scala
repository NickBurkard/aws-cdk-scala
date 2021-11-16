package io.burkard.cdk.services.codestar

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGitHubRepositoryProps {

  def apply(
    repositoryName: String,
    repositoryOwner: String,
    repositoryAccessToken: Option[String] = None,
    connectionArn: Option[String] = None,
    repositoryDescription: Option[String] = None,
    code: Option[software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty] = None,
    isPrivate: Option[Boolean] = None,
    enableIssues: Option[Boolean] = None
  ): software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps =
    (new software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps.Builder)
      .repositoryName(repositoryName)
      .repositoryOwner(repositoryOwner)
      .repositoryAccessToken(repositoryAccessToken.orNull)
      .connectionArn(connectionArn.orNull)
      .repositoryDescription(repositoryDescription.orNull)
      .code(code.orNull)
      .isPrivate(isPrivate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableIssues(enableIssues.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
