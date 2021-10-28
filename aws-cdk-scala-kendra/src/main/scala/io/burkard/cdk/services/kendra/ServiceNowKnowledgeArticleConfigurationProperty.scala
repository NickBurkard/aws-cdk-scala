package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServiceNowKnowledgeArticleConfigurationProperty {

  def apply(
    documentDataFieldName: Option[String] = None,
    fieldMappings: Option[List[_]] = None,
    crawlAttachments: Option[Boolean] = None,
    excludeAttachmentFilePatterns: Option[List[String]] = None,
    documentTitleFieldName: Option[String] = None,
    filterQuery: Option[String] = None,
    includeAttachmentFilePatterns: Option[List[String]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty.Builder)
      .documentDataFieldName(documentDataFieldName.orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .crawlAttachments(crawlAttachments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludeAttachmentFilePatterns(excludeAttachmentFilePatterns.map(_.asJava).orNull)
      .documentTitleFieldName(documentTitleFieldName.orNull)
      .filterQuery(filterQuery.orNull)
      .includeAttachmentFilePatterns(includeAttachmentFilePatterns.map(_.asJava).orNull)
      .build()
}
