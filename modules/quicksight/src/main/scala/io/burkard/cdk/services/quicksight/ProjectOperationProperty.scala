package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProjectOperationProperty {

  def apply(
    projectedColumns: Option[List[String]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty.Builder)
      .projectedColumns(projectedColumns.map(_.asJava).orNull)
      .build()
}
