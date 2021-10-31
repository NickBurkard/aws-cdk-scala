package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagColumnOperationProperty {

  def apply(
    columnName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty.Builder)
      .columnName(columnName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
