package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitHubSourceCredentialsProps {

  def apply(
    accessToken: software.amazon.awscdk.SecretValue
  ): software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps =
    (new software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps.Builder)
      .accessToken(accessToken)
      .build()
}
