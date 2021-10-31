package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
