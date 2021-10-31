package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRegexPatternSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    regularExpressionList: Option[List[String]] = None,
    description: Option[String] = None,
    scope: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wafv2.CfnRegexPatternSet =
    software.amazon.awscdk.services.wafv2.CfnRegexPatternSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .regularExpressionList(regularExpressionList.map(_.asJava).orNull)
      .description(description.orNull)
      .scope(scope.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
