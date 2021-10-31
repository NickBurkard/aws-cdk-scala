package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
