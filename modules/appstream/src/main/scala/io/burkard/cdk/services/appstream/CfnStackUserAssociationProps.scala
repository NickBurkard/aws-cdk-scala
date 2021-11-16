package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStackUserAssociationProps {

  def apply(
    authenticationType: String,
    stackName: String,
    userName: String,
    sendEmailNotification: Option[Boolean] = None
  ): software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps =
    (new software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder)
      .authenticationType(authenticationType)
      .stackName(stackName)
      .userName(userName)
      .sendEmailNotification(sendEmailNotification.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
