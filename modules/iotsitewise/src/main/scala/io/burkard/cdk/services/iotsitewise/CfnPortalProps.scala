package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPortalProps {

  def apply(
    portalName: String,
    portalContactEmail: String,
    roleArn: String,
    portalAuthMode: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    alarms: Option[AnyRef] = None,
    notificationSenderEmail: Option[String] = None,
    portalDescription: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnPortalProps =
    (new software.amazon.awscdk.services.iotsitewise.CfnPortalProps.Builder)
      .portalName(portalName)
      .portalContactEmail(portalContactEmail)
      .roleArn(roleArn)
      .portalAuthMode(portalAuthMode.orNull)
      .tags(tags.map(_.asJava).orNull)
      .alarms(alarms.orNull)
      .notificationSenderEmail(notificationSenderEmail.orNull)
      .portalDescription(portalDescription.orNull)
      .build()
}
