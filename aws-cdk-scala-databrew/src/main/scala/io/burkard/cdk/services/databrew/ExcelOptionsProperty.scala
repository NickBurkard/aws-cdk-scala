package io.burkard.cdk.services.databrew

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExcelOptionsProperty {

  def apply(
    sheetNames: Option[List[String]] = None,
    headerRow: Option[Boolean] = None,
    sheetIndexes: Option[List[_ <: Number]] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty.Builder)
      .sheetNames(sheetNames.map(_.asJava).orNull)
      .headerRow(headerRow.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sheetIndexes(sheetIndexes.map(_.asJava).orNull)
      .build()
}
