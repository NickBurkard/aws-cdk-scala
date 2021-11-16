package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUser {

  def apply(
    internalResourceId: String,
    authenticationType: String,
    userName: String,
    messageAction: Option[String] = None,
    lastName: Option[String] = None,
    firstName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appstream.CfnUser =
    software.amazon.awscdk.services.appstream.CfnUser.Builder
      .create(stackCtx, internalResourceId)
      .authenticationType(authenticationType)
      .userName(userName)
      .messageAction(messageAction.orNull)
      .lastName(lastName.orNull)
      .firstName(firstName.orNull)
      .build()
}
