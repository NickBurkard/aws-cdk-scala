package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRule {

  def apply(
    internalResourceId: String,
    assertions: Option[List[_ <: software.amazon.awscdk.CfnRuleAssertion]] = None,
    ruleCondition: Option[software.amazon.awscdk.ICfnConditionExpression] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnRule =
    software.amazon.awscdk.CfnRule.Builder
      .create(stackCtx, internalResourceId)
      .assertions(assertions.map(_.asJava).orNull)
      .ruleCondition(ruleCondition.orNull)
      .build()
}
