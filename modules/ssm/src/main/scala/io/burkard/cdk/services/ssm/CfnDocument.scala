package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDocument {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    versionName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    documentFormat: Option[String] = None,
    documentType: Option[String] = None,
    content: Option[AnyRef] = None,
    requires: Option[List[_]] = None,
    targetType: Option[String] = None,
    attachments: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssm.CfnDocument =
    software.amazon.awscdk.services.ssm.CfnDocument.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .versionName(versionName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .documentFormat(documentFormat.orNull)
      .documentType(documentType.orNull)
      .content(content.orNull)
      .requires(requires.map(_.asJava).orNull)
      .targetType(targetType.orNull)
      .attachments(attachments.map(_.asJava).orNull)
      .build()
}
