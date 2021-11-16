package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SalesforceStandardObjectConfigurationProperty {

  def apply(
    documentDataFieldName: String,
    name: String,
    fieldMappings: Option[List[_]] = None,
    documentTitleFieldName: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty.Builder)
      .documentDataFieldName(documentDataFieldName)
      .name(name)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .documentTitleFieldName(documentTitleFieldName.orNull)
      .build()
}
