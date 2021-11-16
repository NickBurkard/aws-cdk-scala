package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRegexPatternSet {

  def apply(
    internalResourceId: String,
    regularExpressionList: List[String],
    scope: String,
    name: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wafv2.CfnRegexPatternSet =
    software.amazon.awscdk.services.wafv2.CfnRegexPatternSet.Builder
      .create(stackCtx, internalResourceId)
      .regularExpressionList(regularExpressionList.asJava)
      .scope(scope)
      .name(name.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
