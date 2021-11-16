package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogicalTableProperty {

  def apply(
    source: software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty,
    alias: String,
    dataTransforms: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty.Builder)
      .source(source)
      .alias(alias)
      .dataTransforms(dataTransforms.map(_.asJava).orNull)
      .build()
}
