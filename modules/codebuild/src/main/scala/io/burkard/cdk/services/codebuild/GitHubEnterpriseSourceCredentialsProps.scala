package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitHubEnterpriseSourceCredentialsProps {

  def apply(
    accessToken: Option[software.amazon.awscdk.SecretValue] = None
  ): software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps =
    (new software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps.Builder)
      .accessToken(accessToken.orNull)
      .build()
}
