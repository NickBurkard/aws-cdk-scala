package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSizeConstraintSetProps {

  def apply(
    name: Option[String] = None,
    sizeConstraints: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps =
    (new software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.Builder)
      .name(name.orNull)
      .sizeConstraints(sizeConstraints.map(_.asJava).orNull)
      .build()
}
