package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LayerVersionAttributes {

  def apply(
    compatibleRuntimes: Option[List[_ <: software.amazon.awscdk.services.lambda.Runtime]] = None,
    layerVersionArn: Option[String] = None
  ): software.amazon.awscdk.services.lambda.LayerVersionAttributes =
    (new software.amazon.awscdk.services.lambda.LayerVersionAttributes.Builder)
      .compatibleRuntimes(compatibleRuntimes.map(_.asJava).orNull)
      .layerVersionArn(layerVersionArn.orNull)
      .build()
}
