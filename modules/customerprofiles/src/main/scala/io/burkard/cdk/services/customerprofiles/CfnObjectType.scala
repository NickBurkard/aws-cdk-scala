package io.burkard.cdk.services.customerprofiles

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnObjectType {

  def apply(
    internalResourceId: String,
    domainName: String,
    allowProfileCreation: Option[Boolean] = None,
    objectTypeName: Option[String] = None,
    templateId: Option[String] = None,
    fields: Option[List[_]] = None,
    expirationDays: Option[Number] = None,
    encryptionKey: Option[String] = None,
    keys: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.customerprofiles.CfnObjectType =
    software.amazon.awscdk.services.customerprofiles.CfnObjectType.Builder
      .create(stackCtx, internalResourceId)
      .domainName(domainName)
      .allowProfileCreation(allowProfileCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
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
