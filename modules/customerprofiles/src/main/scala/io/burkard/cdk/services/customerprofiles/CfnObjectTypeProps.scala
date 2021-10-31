package io.burkard.cdk.services.customerprofiles

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnObjectTypeProps {

  def apply(
    allowProfileCreation: Option[Boolean] = None,
    domainName: Option[String] = None,
    objectTypeName: Option[String] = None,
    templateId: Option[String] = None,
    fields: Option[List[_]] = None,
    expirationDays: Option[Number] = None,
    encryptionKey: Option[String] = None,
    keys: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps =
    (new software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps.Builder)
      .allowProfileCreation(allowProfileCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .domainName(domainName.orNull)
      .objectTypeName(objectTypeName.orNull)
      .templateId(templateId.orNull)
      .fields(fields.map(_.asJava).orNull)
      .expirationDays(expirationDays.orNull)
      .encryptionKey(encryptionKey.orNull)
      .keys(keys.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
