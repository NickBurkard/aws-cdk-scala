package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRegexPatternSet {

  def apply(
    internalResourceId: String,
    regexPatternStrings: Option[List[String]] = None,
    name: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet =
    software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet.Builder
      .create(stackCtx, internalResourceId)
      .regexPatternStrings(regexPatternStrings.map(_.asJava).orNull)
      .name(name.orNull)
      .build()
}
