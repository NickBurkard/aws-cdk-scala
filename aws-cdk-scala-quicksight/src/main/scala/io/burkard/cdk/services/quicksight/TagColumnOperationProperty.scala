package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
