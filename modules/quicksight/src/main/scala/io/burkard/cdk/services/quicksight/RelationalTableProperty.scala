package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
