package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LayerVersionOptions {

  def apply(
    description: Option[String] = None,
    license: Option[String] = None,
    layerVersionName: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.lambda.LayerVersionOptions =
    (new software.amazon.awscdk.services.lambda.LayerVersionOptions.Builder)
      .description(description.orNull)
      .license(license.orNull)
      .layerVersionName(layerVersionName.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
