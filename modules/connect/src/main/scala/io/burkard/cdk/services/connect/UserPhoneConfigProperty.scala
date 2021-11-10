package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPhoneConfigProperty {

  def apply(
    deskPhoneNumber: Option[String] = None,
    afterContactWorkTimeLimit: Option[Number] = None,
    autoAccept: Option[Boolean] = None,
    phoneType: Option[String] = None
  ): software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty =
    (new software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty.Builder)
      .deskPhoneNumber(deskPhoneNumber.orNull)
      .afterContactWorkTimeLimit(afterContactWorkTimeLimit.orNull)
      .autoAccept(autoAccept.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .phoneType(phoneType.orNull)
      .build()
}
