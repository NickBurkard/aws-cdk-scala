package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnXssMatchSetProps {

  def apply(
    name: Option[String] = None,
    xssMatchTuples: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps =
    (new software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps.Builder)
      .name(name.orNull)
      .xssMatchTuples(xssMatchTuples.map(_.asJava).orNull)
      .build()
}
