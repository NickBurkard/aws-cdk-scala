package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRegexPatternSet {

  def apply(
    internalResourceId: String,
    regexPatternStrings: List[String],
    name: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet =
    software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet.Builder
      .create(stackCtx, internalResourceId)
      .regexPatternStrings(regexPatternStrings.asJava)
      .name(name)
      .build()
}
