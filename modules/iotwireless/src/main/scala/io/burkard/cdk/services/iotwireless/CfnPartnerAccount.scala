package io.burkard.cdk.services.iotwireless

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPartnerAccount {

  def apply(
    internalResourceId: String,
    fingerprint: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    accountLinked: Option[Boolean] = None,
    sidewalk: Option[software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty] = None,
    sidewalkUpdate: Option[software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty] = None,
    partnerType: Option[String] = None,
    partnerAccountId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotwireless.CfnPartnerAccount =
    software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.Builder
      .create(stackCtx, internalResourceId)
      .fingerprint(fingerprint.orNull)
      .tags(tags.map(_.asJava).orNull)
      .accountLinked(accountLinked.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sidewalk(sidewalk.orNull)
      .sidewalkUpdate(sidewalkUpdate.orNull)
      .partnerType(partnerType.orNull)
      .partnerAccountId(partnerAccountId.orNull)
      .build()
}
