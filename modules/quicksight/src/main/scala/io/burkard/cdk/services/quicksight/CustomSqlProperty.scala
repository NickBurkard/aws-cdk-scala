package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomSqlProperty {

  def apply(
    name: String,
    dataSourceArn: String,
    sqlQuery: String,
    columns: List[_]
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty.Builder)
      .name(name)
      .dataSourceArn(dataSourceArn)
      .sqlQuery(sqlQuery)
      .columns(columns.asJava)
      .build()
}
