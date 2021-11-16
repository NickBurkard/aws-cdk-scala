package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSourceCredentialProps {

  def apply(
    authType: String,
    token: String,
    serverType: String,
    username: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps =
    (new software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps.Builder)
      .authType(authType)
      .token(token)
      .serverType(serverType)
      .username(username.orNull)
      .build()
}
