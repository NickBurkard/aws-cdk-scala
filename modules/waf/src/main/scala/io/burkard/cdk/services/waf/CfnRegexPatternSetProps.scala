package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRegexPatternSetProps {

  def apply(
    regexPatternStrings: List[String],
    name: String
  ): software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps =
    (new software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps.Builder)
      .regexPatternStrings(regexPatternStrings.asJava)
      .name(name)
      .build()
}
