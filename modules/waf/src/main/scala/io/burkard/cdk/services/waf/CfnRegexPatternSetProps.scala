package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRegexPatternSetProps {

  def apply(
    regexPatternStrings: Option[List[String]] = None,
    name: Option[String] = None
  ): software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps =
    (new software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps.Builder)
      .regexPatternStrings(regexPatternStrings.map(_.asJava).orNull)
      .name(name.orNull)
      .build()
}
