package io.burkard.cdk.services.ce

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCostCategoryProps {

  def apply(
    name: String,
    ruleVersion: String,
    rules: String,
    defaultValue: Option[String] = None,
    splitChargeRules: Option[String] = None
  ): software.amazon.awscdk.services.ce.CfnCostCategoryProps =
    (new software.amazon.awscdk.services.ce.CfnCostCategoryProps.Builder)
      .name(name)
      .ruleVersion(ruleVersion)
      .rules(rules)
      .defaultValue(defaultValue.orNull)
      .splitChargeRules(splitChargeRules.orNull)
      .build()
}
