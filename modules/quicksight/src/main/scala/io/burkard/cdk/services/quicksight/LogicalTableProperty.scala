package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogicalTableProperty {

  def apply(
    source: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty] = None,
    alias: Option[String] = None,
    dataTransforms: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty.Builder)
      .source(source.orNull)
      .alias(alias.orNull)
      .dataTransforms(dataTransforms.map(_.asJava).orNull)
      .build()
}