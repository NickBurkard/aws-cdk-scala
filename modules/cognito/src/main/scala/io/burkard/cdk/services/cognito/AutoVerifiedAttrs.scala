package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoVerifiedAttrs {

  def apply(
    email: Option[Boolean] = None,
    phone: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.AutoVerifiedAttrs =
    (new software.amazon.awscdk.services.cognito.AutoVerifiedAttrs.Builder)
      .email(email.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .phone(phone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
