package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SalesforceStandardKnowledgeArticleTypeConfigurationProperty {

  def apply(
    documentTitleFieldName: Option[String] = None,
    documentDataFieldName: Option[String] = None,
    fieldMappings: Option[List[_]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty.Builder)
      .documentTitleFieldName(documentTitleFieldName.orNull)
      .documentDataFieldName(documentDataFieldName.orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .build()
}
