package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnXssMatchSetProps {

  def apply(
    name: String,
    xssMatchTuples: List[_]
  ): software.amazon.awscdk.services.waf.CfnXssMatchSetProps =
    (new software.amazon.awscdk.services.waf.CfnXssMatchSetProps.Builder)
      .name(name)
      .xssMatchTuples(xssMatchTuples.asJava)
      .build()
}
