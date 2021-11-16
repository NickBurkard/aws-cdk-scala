package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInsightRuleProps {

  def apply(
    ruleName: String,
    ruleBody: String,
    ruleState: String,
    tags: Option[List[_]] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps =
    (new software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps.Builder)
      .ruleName(ruleName)
      .ruleBody(ruleBody)
      .ruleState(ruleState)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
