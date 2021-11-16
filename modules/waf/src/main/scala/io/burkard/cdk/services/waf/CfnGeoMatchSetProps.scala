package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGeoMatchSetProps {

  def apply(
    name: String,
    geoMatchConstraints: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps =
    (new software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps.Builder)
      .name(name)
      .geoMatchConstraints(geoMatchConstraints.map(_.asJava).orNull)
      .build()
}
