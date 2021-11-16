package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GeoRestrictionProperty {

  def apply(
    restrictionType: String,
    locations: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty.Builder)
      .restrictionType(restrictionType)
      .locations(locations.map(_.asJava).orNull)
      .build()
}
