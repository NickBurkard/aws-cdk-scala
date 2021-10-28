package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FieldFolderProperty {

  def apply(
    description: Option[String] = None,
    columns: Option[List[String]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty.Builder)
      .description(description.orNull)
      .columns(columns.map(_.asJava).orNull)
      .build()
}
