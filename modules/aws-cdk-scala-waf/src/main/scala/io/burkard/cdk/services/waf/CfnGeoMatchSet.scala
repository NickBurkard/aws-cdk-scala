package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGeoMatchSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    geoMatchConstraints: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet =
    software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .geoMatchConstraints(geoMatchConstraints.map(_.asJava).orNull)
      .build()
}
