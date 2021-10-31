package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitHubSourceCredentials {

  def apply(
    internalResourceId: String,
    accessToken: Option[software.amazon.awscdk.SecretValue] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.GitHubSourceCredentials =
    software.amazon.awscdk.services.codebuild.GitHubSourceCredentials.Builder
      .create(stackCtx, internalResourceId)
      .accessToken(accessToken.orNull)
      .build()
}
