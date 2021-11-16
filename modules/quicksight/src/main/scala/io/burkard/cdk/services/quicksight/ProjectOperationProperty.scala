package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProjectOperationProperty {

  def apply(
    projectedColumns: List[String]
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty.Builder)
      .projectedColumns(projectedColumns.asJava)
      .build()
}
