package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfluenceSpaceToIndexFieldMappingProperty {

  def apply(
    indexFieldName: String,
    dataSourceFieldName: String,
    dateFieldFormat: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty.Builder)
      .indexFieldName(indexFieldName)
      .dataSourceFieldName(dataSourceFieldName)
      .dateFieldFormat(dateFieldFormat.orNull)
      .build()
}
