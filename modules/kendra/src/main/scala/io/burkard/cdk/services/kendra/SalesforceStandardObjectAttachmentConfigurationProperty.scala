package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SalesforceStandardObjectAttachmentConfigurationProperty {

  def apply(
    documentTitleFieldName: Option[String] = None,
    fieldMappings: Option[List[_]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty.Builder)
      .documentTitleFieldName(documentTitleFieldName.orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .build()
}
