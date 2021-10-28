package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMultiRegionAccessPointProps {

  def apply(
    name: Option[String] = None,
    regions: Option[List[_]] = None,
    publicAccessBlockConfiguration: Option[software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty] = None
  ): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps =
    (new software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps.Builder)
      .name(name.orNull)
      .regions(regions.map(_.asJava).orNull)
      .publicAccessBlockConfiguration(publicAccessBlockConfiguration.orNull)
      .build()
}
