package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
