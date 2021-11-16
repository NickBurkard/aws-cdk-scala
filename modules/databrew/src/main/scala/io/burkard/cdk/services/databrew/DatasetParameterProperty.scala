package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatasetParameterProperty {

  def apply(
    `type`: String,
    name: String,
    filter: Option[software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty] = None,
    datetimeOptions: Option[software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty] = None,
    createColumn: Option[Boolean] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty.Builder)
      .`type`(`type`)
      .name(name)
      .filter(filter.orNull)
      .datetimeOptions(datetimeOptions.orNull)
      .createColumn(createColumn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
