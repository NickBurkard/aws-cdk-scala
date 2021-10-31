package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
