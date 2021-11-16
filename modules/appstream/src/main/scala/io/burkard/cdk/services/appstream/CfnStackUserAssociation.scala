package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStackUserAssociation {

  def apply(
    internalResourceId: String,
    authenticationType: String,
    stackName: String,
    userName: String,
    sendEmailNotification: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appstream.CfnStackUserAssociation =
    software.amazon.awscdk.services.appstream.CfnStackUserAssociation.Builder
      .create(stackCtx, internalResourceId)
      .authenticationType(authenticationType)
      .stackName(stackName)
      .userName(userName)
      .sendEmailNotification(sendEmailNotification.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
