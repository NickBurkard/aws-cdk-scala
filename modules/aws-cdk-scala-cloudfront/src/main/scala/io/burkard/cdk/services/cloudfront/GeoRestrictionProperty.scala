package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GeoRestrictionProperty {

  def apply(
    locations: Option[List[String]] = None,
    restrictionType: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty.Builder)
      .locations(locations.map(_.asJava).orNull)
      .restrictionType(restrictionType.orNull)
      .build()
}
