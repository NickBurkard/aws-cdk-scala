package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SignInUrlOptions {

  def apply(
    redirectUri: Option[String] = None,
    signInPath: Option[String] = None
  ): software.amazon.awscdk.services.cognito.SignInUrlOptions =
    (new software.amazon.awscdk.services.cognito.SignInUrlOptions.Builder)
      .redirectUri(redirectUri.orNull)
      .signInPath(signInPath.orNull)
      .build()
}
