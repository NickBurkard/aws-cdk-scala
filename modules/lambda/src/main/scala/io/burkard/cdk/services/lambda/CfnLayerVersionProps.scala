package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLayerVersionProps {

  def apply(
    content: software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty,
    description: Option[String] = None,
    compatibleArchitectures: Option[List[String]] = None,
    compatibleRuntimes: Option[List[String]] = None,
    licenseInfo: Option[String] = None,
    layerName: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnLayerVersionProps =
    (new software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder)
      .content(content)
      .description(description.orNull)
      .compatibleArchitectures(compatibleArchitectures.map(_.asJava).orNull)
      .compatibleRuntimes(compatibleRuntimes.map(_.asJava).orNull)
      .licenseInfo(licenseInfo.orNull)
      .layerName(layerName.orNull)
      .build()
}
