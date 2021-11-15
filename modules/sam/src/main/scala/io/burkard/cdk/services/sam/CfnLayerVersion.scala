package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLayerVersion {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    compatibleRuntimes: Option[List[String]] = None,
    licenseInfo: Option[String] = None,
    retentionPolicy: Option[String] = None,
    layerName: Option[String] = None,
    contentUri0: Option[String] = None,
    contentUri1: Option[software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sam.CfnLayerVersion =
    software.amazon.awscdk.services.sam.CfnLayerVersion.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .compatibleRuntimes(compatibleRuntimes.map(_.asJava).orNull)
      .licenseInfo(licenseInfo.orNull)
      .retentionPolicy(retentionPolicy.orNull)
      .layerName(layerName.orNull)
      .contentUri(contentUri0.orNull)
      .contentUri(contentUri1.orNull)
      .build()
}
