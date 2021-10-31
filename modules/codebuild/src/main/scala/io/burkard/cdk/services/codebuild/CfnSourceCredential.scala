package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSourceCredential {

  def apply(
    internalResourceId: String,
    username: Option[String] = None,
    authType: Option[String] = None,
    token: Option[String] = None,
    serverType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.CfnSourceCredential =
    software.amazon.awscdk.services.codebuild.CfnSourceCredential.Builder
      .create(stackCtx, internalResourceId)
      .username(username.orNull)
      .authType(authType.orNull)
      .token(token.orNull)
      .serverType(serverType.orNull)
      .build()
}
