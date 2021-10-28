package io.burkard.cdk.services.ce

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCostCategory {

  def apply(
    internalResourceId: String,
    defaultValue: Option[String] = None,
    name: Option[String] = None,
    ruleVersion: Option[String] = None,
    splitChargeRules: Option[String] = None,
    rules: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ce.CfnCostCategory =
    software.amazon.awscdk.services.ce.CfnCostCategory.Builder
      .create(stackCtx, internalResourceId)
      .defaultValue(defaultValue.orNull)
      .name(name.orNull)
      .ruleVersion(ruleVersion.orNull)
      .splitChargeRules(splitChargeRules.orNull)
      .rules(rules.orNull)
      .build()
}
