package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LayerVersion {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    compatibleArchitectures: Option[List[_ <: software.amazon.awscdk.services.lambda.Architecture]] = None,
    compatibleRuntimes: Option[List[_ <: software.amazon.awscdk.services.lambda.Runtime]] = None,
    layerVersionName: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    code: Option[software.amazon.awscdk.services.lambda.Code] = None,
    license: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.LayerVersion =
    software.amazon.awscdk.services.lambda.LayerVersion.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .compatibleArchitectures(compatibleArchitectures.map(_.asJava).orNull)
      .compatibleRuntimes(compatibleRuntimes.map(_.asJava).orNull)
      .layerVersionName(layerVersionName.orNull)
      .removalPolicy(removalPolicy.orNull)
      .code(code.orNull)
      .license(license.orNull)
      .build()
}
