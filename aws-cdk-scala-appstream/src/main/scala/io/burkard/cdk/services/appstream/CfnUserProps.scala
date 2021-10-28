package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserProps {

  def apply(
    authenticationType: Option[String] = None,
    messageAction: Option[String] = None,
    lastName: Option[String] = None,
    firstName: Option[String] = None,
    userName: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnUserProps =
    (new software.amazon.awscdk.services.appstream.CfnUserProps.Builder)
      .authenticationType(authenticationType.orNull)
      .messageAction(messageAction.orNull)
      .lastName(lastName.orNull)
      .firstName(firstName.orNull)
      .userName(userName.orNull)
      .build()
}
