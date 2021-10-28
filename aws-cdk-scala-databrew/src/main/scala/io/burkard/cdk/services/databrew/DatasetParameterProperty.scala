package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatasetParameterProperty {

  def apply(
    filter: Option[software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty] = None,
    datetimeOptions: Option[software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty] = None,
    `type`: Option[String] = None,
    name: Option[String] = None,
    createColumn: Option[Boolean] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty.Builder)
      .filter(filter.orNull)
      .datetimeOptions(datetimeOptions.orNull)
      .`type`(`type`.orNull)
      .name(name.orNull)
      .createColumn(createColumn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
