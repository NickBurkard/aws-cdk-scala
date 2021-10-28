package io.burkard.cdk.services.pinpointemail

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnIdentityProps {

  def apply(
    mailFromAttributes: Option[software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.pinpointemail.CfnIdentity.TagsProperty]] = None,
    name: Option[String] = None,
    feedbackForwardingEnabled: Option[Boolean] = None,
    dkimSigningEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnIdentityProps =
    (new software.amazon.awscdk.services.pinpointemail.CfnIdentityProps.Builder)
      .mailFromAttributes(mailFromAttributes.orNull)
      .tags(tags.map(_.asJava).orNull)
      .name(name.orNull)
      .feedbackForwardingEnabled(feedbackForwardingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dkimSigningEnabled(dkimSigningEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
