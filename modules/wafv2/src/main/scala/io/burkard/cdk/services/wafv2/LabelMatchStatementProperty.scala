package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LabelMatchStatementProperty {

  def apply(
    scope: Option[String] = None,
    key: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty.Builder)
      .scope(scope.orNull)
      .key(key.orNull)
      .build()
}
