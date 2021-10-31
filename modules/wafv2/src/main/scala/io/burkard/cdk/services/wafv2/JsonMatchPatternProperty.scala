package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JsonMatchPatternProperty {

  def apply(
    all: Option[AnyRef] = None,
    includedPaths: Option[List[String]] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty.Builder)
      .all(all.orNull)
      .includedPaths(includedPaths.map(_.asJava).orNull)
      .build()
}
