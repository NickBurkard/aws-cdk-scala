package io.burkard.cdk.services.customerprofiles

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDomain {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainName: Option[String] = None,
    defaultEncryptionKey: Option[String] = None,
    defaultExpirationDays: Option[Number] = None,
    deadLetterQueueUrl: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.customerprofiles.CfnDomain =
    software.amazon.awscdk.services.customerprofiles.CfnDomain.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .defaultEncryptionKey(defaultEncryptionKey.orNull)
      .defaultExpirationDays(defaultExpirationDays.orNull)
      .deadLetterQueueUrl(deadLetterQueueUrl.orNull)
      .build()
}
