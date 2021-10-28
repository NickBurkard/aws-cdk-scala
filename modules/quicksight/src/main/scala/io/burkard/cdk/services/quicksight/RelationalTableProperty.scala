package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RelationalTableProperty {

  def apply(
    name: Option[String] = None,
    catalog: Option[String] = None,
    dataSourceArn: Option[String] = None,
    inputColumns: Option[List[_]] = None,
    schema: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty.Builder)
      .name(name.orNull)
      .catalog(catalog.orNull)
      .dataSourceArn(dataSourceArn.orNull)
      .inputColumns(inputColumns.map(_.asJava).orNull)
      .schema(schema.orNull)
      .build()
}
