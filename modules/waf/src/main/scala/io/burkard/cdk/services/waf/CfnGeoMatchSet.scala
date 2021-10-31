package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
