package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSourceCredentialProps {

  def apply(
    username: Option[String] = None,
    authType: Option[String] = None,
    token: Option[String] = None,
    serverType: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps =
    (new software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps.Builder)
      .username(username.orNull)
      .authType(authType.orNull)
      .token(token.orNull)
      .serverType(serverType.orNull)
      .build()
}
