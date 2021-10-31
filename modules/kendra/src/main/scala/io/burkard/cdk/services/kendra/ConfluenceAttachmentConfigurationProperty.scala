package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfluenceAttachmentConfigurationProperty {

  def apply(
    attachmentFieldMappings: Option[List[_]] = None,
    crawlAttachments: Option[Boolean] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty.Builder)
      .attachmentFieldMappings(attachmentFieldMappings.map(_.asJava).orNull)
      .crawlAttachments(crawlAttachments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
