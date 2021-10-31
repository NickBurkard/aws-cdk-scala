package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMultiRegionAccessPoint {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    regions: Option[List[_]] = None,
    publicAccessBlockConfiguration: Option[software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint =
    software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .regions(regions.map(_.asJava).orNull)
      .publicAccessBlockConfiguration(publicAccessBlockConfiguration.orNull)
      .build()
}
