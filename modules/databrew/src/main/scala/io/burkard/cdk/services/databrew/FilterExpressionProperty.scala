package io.burkard.cdk.services.databrew

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
