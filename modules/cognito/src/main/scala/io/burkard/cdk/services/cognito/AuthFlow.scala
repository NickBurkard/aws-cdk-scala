package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthFlow {

  def apply(
    custom: Option[Boolean] = None,
    adminUserPassword: Option[Boolean] = None,
    userPassword: Option[Boolean] = None,
    userSrp: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.AuthFlow =
    (new software.amazon.awscdk.services.cognito.AuthFlow.Builder)
      .custom(custom.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .adminUserPassword(adminUserPassword.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .userPassword(userPassword.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .userSrp(userSrp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
