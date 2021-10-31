package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStackUserAssociation {

  def apply(
    internalResourceId: String,
    authenticationType: Option[String] = None,
    sendEmailNotification: Option[Boolean] = None,
    stackName: Option[String] = None,
    userName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appstream.CfnStackUserAssociation =
    software.amazon.awscdk.services.appstream.CfnStackUserAssociation.Builder
      .create(stackCtx, internalResourceId)
      .authenticationType(authenticationType.orNull)
      .sendEmailNotification(sendEmailNotification.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stackName(stackName.orNull)
      .userName(userName.orNull)
      .build()
}
