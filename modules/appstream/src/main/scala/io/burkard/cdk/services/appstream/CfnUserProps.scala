package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserProps {

  def apply(
    authenticationType: String,
    userName: String,
    messageAction: Option[String] = None,
    lastName: Option[String] = None,
    firstName: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnUserProps =
    (new software.amazon.awscdk.services.appstream.CfnUserProps.Builder)
      .authenticationType(authenticationType)
      .userName(userName)
      .messageAction(messageAction.orNull)
      .lastName(lastName.orNull)
      .firstName(firstName.orNull)
      .build()
}
