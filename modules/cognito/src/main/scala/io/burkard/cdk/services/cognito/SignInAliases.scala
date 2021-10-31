package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SignInAliases {

  def apply(
    email: Option[Boolean] = None,
    username: Option[Boolean] = None,
    preferredUsername: Option[Boolean] = None,
    phone: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.SignInAliases =
    (new software.amazon.awscdk.services.cognito.SignInAliases.Builder)
      .email(email.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .username(username.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .preferredUsername(preferredUsername.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .phone(phone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
