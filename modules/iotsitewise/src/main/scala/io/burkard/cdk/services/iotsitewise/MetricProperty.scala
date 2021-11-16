package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricProperty {

  def apply(
    window: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty,
    variables: List[_],
    expression: String
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty.Builder)
      .window(window)
      .variables(variables.asJava)
      .expression(expression)
      .build()
}
