package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLayerVersionProps {

  def apply(
    description: Option[String] = None,
    compatibleRuntimes: Option[List[String]] = None,
    licenseInfo: Option[String] = None,
    retentionPolicy: Option[String] = None,
    layerName: Option[String] = None,
    contentUri0: Option[String] = None,
    contentUri1: Option[software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty] = None
  ): software.amazon.awscdk.services.sam.CfnLayerVersionProps =
    (new software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder)
      .description(description.orNull)
      .compatibleRuntimes(compatibleRuntimes.map(_.asJava).orNull)
      .licenseInfo(licenseInfo.orNull)
      .retentionPolicy(retentionPolicy.orNull)
      .layerName(layerName.orNull)
      .contentUri(contentUri0.orNull)
      .contentUri(contentUri1.orNull)
      .build()
}
