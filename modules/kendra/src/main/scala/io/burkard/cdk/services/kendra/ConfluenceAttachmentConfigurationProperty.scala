package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
