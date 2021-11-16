package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInsightRule {

  def apply(
    internalResourceId: String,
    ruleName: String,
    ruleBody: String,
    ruleState: String,
    tags: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudwatch.CfnInsightRule =
    software.amazon.awscdk.services.cloudwatch.CfnInsightRule.Builder
      .create(stackCtx, internalResourceId)
      .ruleName(ruleName)
      .ruleBody(ruleBody)
      .ruleState(ruleState)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
