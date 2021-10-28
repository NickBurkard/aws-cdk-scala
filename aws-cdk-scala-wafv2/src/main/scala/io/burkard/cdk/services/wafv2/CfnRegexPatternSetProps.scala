package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRegexPatternSetProps {

  def apply(
    name: Option[String] = None,
    regularExpressionList: Option[List[String]] = None,
    description: Option[String] = None,
    scope: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps =
    (new software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps.Builder)
      .name(name.orNull)
      .regularExpressionList(regularExpressionList.map(_.asJava).orNull)
      .description(description.orNull)
      .scope(scope.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
