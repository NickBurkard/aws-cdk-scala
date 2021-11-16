package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitHubEnterpriseSourceCredentialsProps {

  def apply(
    accessToken: software.amazon.awscdk.SecretValue
  ): software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps =
    (new software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps.Builder)
      .accessToken(accessToken)
      .build()
}
