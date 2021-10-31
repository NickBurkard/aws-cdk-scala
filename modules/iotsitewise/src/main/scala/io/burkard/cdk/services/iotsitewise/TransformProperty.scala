package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
