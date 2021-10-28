package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomSqlProperty {

  def apply(
    name: Option[String] = None,
    dataSourceArn: Option[String] = None,
    sqlQuery: Option[String] = None,
    columns: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty.Builder)
      .name(name.orNull)
      .dataSourceArn(dataSourceArn.orNull)
      .sqlQuery(sqlQuery.orNull)
      .columns(columns.map(_.asJava).orNull)
      .build()
}
