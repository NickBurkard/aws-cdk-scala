package io.burkard.cdk.services.iotwireless

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPartnerAccountProps {

  def apply(
    fingerprint: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    accountLinked: Option[Boolean] = None,
    sidewalk: Option[software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty] = None,
    sidewalkUpdate: Option[software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty] = None,
    partnerType: Option[String] = None,
    partnerAccountId: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps =
    (new software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps.Builder)
      .fingerprint(fingerprint.orNull)
      .tags(tags.map(_.asJava).orNull)
      .accountLinked(accountLinked.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sidewalk(sidewalk.orNull)
      .sidewalkUpdate(sidewalkUpdate.orNull)
      .partnerType(partnerType.orNull)
      .partnerAccountId(partnerAccountId.orNull)
      .build()
}
