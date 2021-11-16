package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ColumnConfigurationProperty {

  def apply(
    changeDetectingColumns: List[String],
    documentDataColumnName: String,
    documentIdColumnName: String,
    documentTitleColumnName: Option[String] = None,
    fieldMappings: Option[List[_]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty.Builder)
      .changeDetectingColumns(changeDetectingColumns.asJava)
      .documentDataColumnName(documentDataColumnName)
      .documentIdColumnName(documentIdColumnName)
      .documentTitleColumnName(documentTitleColumnName.orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .build()
}
