package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDocumentProps {

  def apply(
    content: AnyRef,
    name: Option[String] = None,
    versionName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    documentFormat: Option[String] = None,
    documentType: Option[String] = None,
    requires: Option[List[_]] = None,
    targetType: Option[String] = None,
    attachments: Option[List[_]] = None
  ): software.amazon.awscdk.services.ssm.CfnDocumentProps =
    (new software.amazon.awscdk.services.ssm.CfnDocumentProps.Builder)
      .content(content)
      .name(name.orNull)
      .versionName(versionName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .documentFormat(documentFormat.orNull)
      .documentType(documentType.orNull)
      .requires(requires.map(_.asJava).orNull)
      .targetType(targetType.orNull)
      .attachments(attachments.map(_.asJava).orNull)
      .build()
}
