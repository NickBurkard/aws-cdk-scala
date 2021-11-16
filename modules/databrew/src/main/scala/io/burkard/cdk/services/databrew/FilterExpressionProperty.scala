package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FilterExpressionProperty {

  def apply(
    expression: String,
    valuesMap: List[_]
  ): software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty.Builder)
      .expression(expression)
      .valuesMap(valuesMap.asJava)
      .build()
}
