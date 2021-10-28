package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
