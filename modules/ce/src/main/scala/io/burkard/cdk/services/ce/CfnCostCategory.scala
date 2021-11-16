package io.burkard.cdk.services.ce

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCostCategory {

  def apply(
    internalResourceId: String,
    name: String,
    ruleVersion: String,
    rules: String,
    defaultValue: Option[String] = None,
    splitChargeRules: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ce.CfnCostCategory =
    software.amazon.awscdk.services.ce.CfnCostCategory.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .ruleVersion(ruleVersion)
      .rules(rules)
      .defaultValue(defaultValue.orNull)
      .splitChargeRules(splitChargeRules.orNull)
      .build()
}
