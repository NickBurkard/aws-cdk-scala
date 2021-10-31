package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGeoMatchSetProps {

  def apply(
    name: Option[String] = None,
    geoMatchConstraints: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps =
    (new software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps.Builder)
      .name(name.orNull)
      .geoMatchConstraints(geoMatchConstraints.map(_.asJava).orNull)
      .build()
}
