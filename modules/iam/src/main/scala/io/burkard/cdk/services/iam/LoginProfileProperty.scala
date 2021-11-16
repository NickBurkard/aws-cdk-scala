package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoginProfileProperty {

  def apply(
    password: String,
    passwordResetRequired: Option[Boolean] = None
  ): software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty =
    (new software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty.Builder)
      .password(password)
      .passwordResetRequired(passwordResetRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
