package io.burkard.cdk.services.iotsitewise

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricProperty {

  def apply(
    window: Option[software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty] = None,
    variables: Option[List[_]] = None,
    expression: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty.Builder)
      .window(window.orNull)
      .variables(variables.map(_.asJava).orNull)
      .expression(expression.orNull)
      .build()
}
