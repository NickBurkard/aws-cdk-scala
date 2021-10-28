package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

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
