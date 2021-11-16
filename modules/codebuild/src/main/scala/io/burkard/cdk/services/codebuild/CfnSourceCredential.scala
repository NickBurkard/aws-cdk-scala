package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSourceCredential {

  def apply(
    internalResourceId: String,
    authType: String,
    token: String,
    serverType: String,
    username: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.CfnSourceCredential =
    software.amazon.awscdk.services.codebuild.CfnSourceCredential.Builder
      .create(stackCtx, internalResourceId)
      .authType(authType)
      .token(token)
      .serverType(serverType)
      .username(username.orNull)
      .build()
}
