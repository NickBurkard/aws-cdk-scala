package io.burkard.cdk.services.iotsitewise

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TransformProperty {

  def apply(
    variables: Option[List[_]] = None,
    expression: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty.Builder)
      .variables(variables.map(_.asJava).orNull)
      .expression(expression.orNull)
      .build()
}
