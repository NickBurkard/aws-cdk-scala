package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMultiRegionAccessPoint {

  def apply(
    internalResourceId: String,
    regions: List[_],
    name: Option[String] = None,
    publicAccessBlockConfiguration: Option[software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint =
    software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.Builder
      .create(stackCtx, internalResourceId)
      .regions(regions.asJava)
      .name(name.orNull)
      .publicAccessBlockConfiguration(publicAccessBlockConfiguration.orNull)
      .build()
}
