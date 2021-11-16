package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfluencePageToIndexFieldMappingProperty {

  def apply(
    indexFieldName: String,
    dataSourceFieldName: String,
    dateFieldFormat: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty.Builder)
      .indexFieldName(indexFieldName)
      .dataSourceFieldName(dataSourceFieldName)
      .dateFieldFormat(dateFieldFormat.orNull)
      .build()
}
