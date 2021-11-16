package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RelationalTableProperty {

  def apply(
    name: String,
    dataSourceArn: String,
    inputColumns: List[_],
    catalog: Option[String] = None,
    schema: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty.Builder)
      .name(name)
      .dataSourceArn(dataSourceArn)
      .inputColumns(inputColumns.asJava)
      .catalog(catalog.orNull)
      .schema(schema.orNull)
      .build()
}
