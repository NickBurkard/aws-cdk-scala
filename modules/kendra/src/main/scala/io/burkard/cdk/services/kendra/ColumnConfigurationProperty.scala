package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ColumnConfigurationProperty {

  def apply(
    documentTitleColumnName: Option[String] = None,
    fieldMappings: Option[List[_]] = None,
    changeDetectingColumns: Option[List[String]] = None,
    documentDataColumnName: Option[String] = None,
    documentIdColumnName: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty.Builder)
      .documentTitleColumnName(documentTitleColumnName.orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .changeDetectingColumns(changeDetectingColumns.map(_.asJava).orNull)
      .documentDataColumnName(documentDataColumnName.orNull)
      .documentIdColumnName(documentIdColumnName.orNull)
      .build()
}
