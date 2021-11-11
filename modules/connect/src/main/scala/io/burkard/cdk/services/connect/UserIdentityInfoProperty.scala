package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserIdentityInfoProperty {

  def apply(
    email: Option[String] = None,
    lastName: Option[String] = None,
    firstName: Option[String] = None
  ): software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty =
    (new software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty.Builder)
      .email(email.orNull)
      .lastName(lastName.orNull)
      .firstName(firstName.orNull)
      .build()
}
