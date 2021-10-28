package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LayerVersionProps {

  def apply(
    description: Option[String] = None,
    compatibleArchitectures: Option[List[_ <: software.amazon.awscdk.services.lambda.Architecture]] = None,
    compatibleRuntimes: Option[List[_ <: software.amazon.awscdk.services.lambda.Runtime]] = None,
    layerVersionName: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    code: Option[software.amazon.awscdk.services.lambda.Code] = None,
    license: Option[String] = None
  ): software.amazon.awscdk.services.lambda.LayerVersionProps =
    (new software.amazon.awscdk.services.lambda.LayerVersionProps.Builder)
      .description(description.orNull)
      .compatibleArchitectures(compatibleArchitectures.map(_.asJava).orNull)
      .compatibleRuntimes(compatibleRuntimes.map(_.asJava).orNull)
      .layerVersionName(layerVersionName.orNull)
      .removalPolicy(removalPolicy.orNull)
      .code(code.orNull)
      .license(license.orNull)
      .build()
}
