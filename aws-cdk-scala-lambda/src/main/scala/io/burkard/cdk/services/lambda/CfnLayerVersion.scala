package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLayerVersion {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    compatibleArchitectures: Option[List[String]] = None,
    compatibleRuntimes: Option[List[String]] = None,
    licenseInfo: Option[String] = None,
    layerName: Option[String] = None,
    content: Option[software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnLayerVersion =
    software.amazon.awscdk.services.lambda.CfnLayerVersion.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .compatibleArchitectures(compatibleArchitectures.map(_.asJava).orNull)
      .compatibleRuntimes(compatibleRuntimes.map(_.asJava).orNull)
      .licenseInfo(licenseInfo.orNull)
      .layerName(layerName.orNull)
      .content(content.orNull)
      .build()
}
