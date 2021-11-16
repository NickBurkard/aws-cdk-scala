package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceNowKnowledgeArticleConfigurationProperty {

  def apply(
    documentDataFieldName: String,
    fieldMappings: Option[List[_]] = None,
    crawlAttachments: Option[Boolean] = None,
    excludeAttachmentFilePatterns: Option[List[String]] = None,
    documentTitleFieldName: Option[String] = None,
    filterQuery: Option[String] = None,
    includeAttachmentFilePatterns: Option[List[String]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty.Builder)
      .documentDataFieldName(documentDataFieldName)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .crawlAttachments(crawlAttachments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludeAttachmentFilePatterns(excludeAttachmentFilePatterns.map(_.asJava).orNull)
      .documentTitleFieldName(documentTitleFieldName.orNull)
      .filterQuery(filterQuery.orNull)
      .includeAttachmentFilePatterns(includeAttachmentFilePatterns.map(_.asJava).orNull)
      .build()
}
