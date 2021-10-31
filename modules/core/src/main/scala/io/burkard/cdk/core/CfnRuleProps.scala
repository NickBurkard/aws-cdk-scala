package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRuleProps {

  def apply(
    assertions: Option[List[_ <: software.amazon.awscdk.CfnRuleAssertion]] = None,
    ruleCondition: Option[software.amazon.awscdk.ICfnConditionExpression] = None
  ): software.amazon.awscdk.CfnRuleProps =
    (new software.amazon.awscdk.CfnRuleProps.Builder)
      .assertions(assertions.map(_.asJava).orNull)
      .ruleCondition(ruleCondition.orNull)
      .build()
}
