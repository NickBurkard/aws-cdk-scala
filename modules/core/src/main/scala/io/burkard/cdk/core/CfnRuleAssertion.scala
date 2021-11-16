package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRuleAssertion {

  def apply(
    assertDescription: String,
    assertValue: software.amazon.awscdk.ICfnConditionExpression
  ): software.amazon.awscdk.CfnRuleAssertion =
    (new software.amazon.awscdk.CfnRuleAssertion.Builder)
      .assertDescription(assertDescription)
      .assertValue(assertValue)
      .build()
}
