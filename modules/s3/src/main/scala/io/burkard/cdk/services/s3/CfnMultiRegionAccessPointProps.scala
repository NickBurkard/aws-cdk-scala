package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMultiRegionAccessPointProps {

  def apply(
    regions: List[_],
    name: Option[String] = None,
    publicAccessBlockConfiguration: Option[software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty] = None
  ): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps =
    (new software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps.Builder)
      .regions(regions.asJava)
      .name(name.orNull)
      .publicAccessBlockConfiguration(publicAccessBlockConfiguration.orNull)
      .build()
}
