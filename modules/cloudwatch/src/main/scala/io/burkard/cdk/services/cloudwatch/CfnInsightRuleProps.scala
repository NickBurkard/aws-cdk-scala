package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInsightRuleProps {

  def apply(
    ruleName: Option[String] = None,
    tags: Option[List[_]] = None,
    ruleBody: Option[String] = None,
    ruleState: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps =
    (new software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps.Builder)
      .ruleName(ruleName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .ruleBody(ruleBody.orNull)
      .ruleState(ruleState.orNull)
      .build()
}
