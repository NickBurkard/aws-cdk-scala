package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SalesforceChatterFeedConfigurationProperty {

  def apply(
    documentTitleFieldName: Option[String] = None,
    documentDataFieldName: Option[String] = None,
    fieldMappings: Option[List[_]] = None,
    includeFilterTypes: Option[List[String]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty.Builder)
      .documentTitleFieldName(documentTitleFieldName.orNull)
      .documentDataFieldName(documentDataFieldName.orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .includeFilterTypes(includeFilterTypes.map(_.asJava).orNull)
      .build()
}
