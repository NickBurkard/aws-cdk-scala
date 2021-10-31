package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataSourceToIndexFieldMappingProperty {

  def apply(
    indexFieldName: Option[String] = None,
    dataSourceFieldName: Option[String] = None,
    dateFieldFormat: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty.Builder)
      .indexFieldName(indexFieldName.orNull)
      .dataSourceFieldName(dataSourceFieldName.orNull)
      .dateFieldFormat(dateFieldFormat.orNull)
      .build()
}
