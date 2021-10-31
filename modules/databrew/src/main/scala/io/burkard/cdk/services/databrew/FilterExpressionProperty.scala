package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FilterExpressionProperty {

  def apply(
    expression: Option[String] = None,
    valuesMap: Option[List[_]] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty.Builder)
      .expression(expression.orNull)
      .valuesMap(valuesMap.map(_.asJava).orNull)
      .build()
}
