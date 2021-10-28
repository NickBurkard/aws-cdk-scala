package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnXssMatchSetProps {

  def apply(
    name: Option[String] = None,
    xssMatchTuples: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.CfnXssMatchSetProps =
    (new software.amazon.awscdk.services.waf.CfnXssMatchSetProps.Builder)
      .name(name.orNull)
      .xssMatchTuples(xssMatchTuples.map(_.asJava).orNull)
      .build()
}
