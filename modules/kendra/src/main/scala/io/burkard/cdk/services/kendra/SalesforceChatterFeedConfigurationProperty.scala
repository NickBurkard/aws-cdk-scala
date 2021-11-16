package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SalesforceChatterFeedConfigurationProperty {

  def apply(
    documentDataFieldName: String,
    documentTitleFieldName: Option[String] = None,
    fieldMappings: Option[List[_]] = None,
    includeFilterTypes: Option[List[String]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty.Builder)
      .documentDataFieldName(documentDataFieldName)
      .documentTitleFieldName(documentTitleFieldName.orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .includeFilterTypes(includeFilterTypes.map(_.asJava).orNull)
      .build()
}
