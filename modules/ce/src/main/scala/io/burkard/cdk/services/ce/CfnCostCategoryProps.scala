package io.burkard.cdk.services.ce

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCostCategoryProps {

  def apply(
    defaultValue: Option[String] = None,
    name: Option[String] = None,
    ruleVersion: Option[String] = None,
    splitChargeRules: Option[String] = None,
    rules: Option[String] = None
  ): software.amazon.awscdk.services.ce.CfnCostCategoryProps =
    (new software.amazon.awscdk.services.ce.CfnCostCategoryProps.Builder)
      .defaultValue(defaultValue.orNull)
      .name(name.orNull)
      .ruleVersion(ruleVersion.orNull)
      .splitChargeRules(splitChargeRules.orNull)
      .rules(rules.orNull)
      .build()
}
