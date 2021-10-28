package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStackUserAssociationProps {

  def apply(
    authenticationType: Option[String] = None,
    sendEmailNotification: Option[Boolean] = None,
    stackName: Option[String] = None,
    userName: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps =
    (new software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder)
      .authenticationType(authenticationType.orNull)
      .sendEmailNotification(sendEmailNotification.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stackName(stackName.orNull)
      .userName(userName.orNull)
      .build()
}
