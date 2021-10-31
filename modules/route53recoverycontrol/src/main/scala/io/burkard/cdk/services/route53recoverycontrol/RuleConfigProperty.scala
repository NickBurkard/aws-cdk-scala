package io.burkard.cdk.services.route53recoverycontrol

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleConfigProperty {

  def apply(
    inverted: Option[Boolean] = None,
    threshold: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty.Builder)
      .inverted(inverted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .threshold(threshold.orNull)
      .`type`(`type`.orNull)
      .build()
}
