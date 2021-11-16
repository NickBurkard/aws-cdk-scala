package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagColumnOperationProperty {

  def apply(
    columnName: String,
    tags: List[_ <: software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty]
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty.Builder)
      .columnName(columnName)
      .tags(tags.asJava)
      .build()
}
