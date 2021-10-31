package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitHubSourceCredentialsProps {

  def apply(
    accessToken: Option[software.amazon.awscdk.SecretValue] = None
  ): software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps =
    (new software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps.Builder)
      .accessToken(accessToken.orNull)
      .build()
}
