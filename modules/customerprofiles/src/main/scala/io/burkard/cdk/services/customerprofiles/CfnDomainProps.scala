package io.burkard.cdk.services.customerprofiles

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomainProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainName: Option[String] = None,
    defaultEncryptionKey: Option[String] = None,
    defaultExpirationDays: Option[Number] = None,
    deadLetterQueueUrl: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnDomainProps =
    (new software.amazon.awscdk.services.customerprofiles.CfnDomainProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .defaultEncryptionKey(defaultEncryptionKey.orNull)
      .defaultExpirationDays(defaultExpirationDays.orNull)
      .deadLetterQueueUrl(deadLetterQueueUrl.orNull)
      .build()
}
