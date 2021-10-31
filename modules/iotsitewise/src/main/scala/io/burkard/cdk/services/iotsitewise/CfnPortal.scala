package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPortal {

  def apply(
    internalResourceId: String,
    portalAuthMode: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    portalName: Option[String] = None,
    alarms: Option[AnyRef] = None,
    notificationSenderEmail: Option[String] = None,
    portalContactEmail: Option[String] = None,
    roleArn: Option[String] = None,
    portalDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotsitewise.CfnPortal =
    software.amazon.awscdk.services.iotsitewise.CfnPortal.Builder
      .create(stackCtx, internalResourceId)
      .portalAuthMode(portalAuthMode.orNull)
      .tags(tags.map(_.asJava).orNull)
      .portalName(portalName.orNull)
      .alarms(alarms.orNull)
      .notificationSenderEmail(notificationSenderEmail.orNull)
      .portalContactEmail(portalContactEmail.orNull)
      .roleArn(roleArn.orNull)
      .portalDescription(portalDescription.orNull)
      .build()
}
