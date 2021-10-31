package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ColumnLevelPermissionRuleProperty {

  def apply(
    principals: Option[List[String]] = None,
    columnNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty.Builder)
      .principals(principals.map(_.asJava).orNull)
      .columnNames(columnNames.map(_.asJava).orNull)
      .build()
}
