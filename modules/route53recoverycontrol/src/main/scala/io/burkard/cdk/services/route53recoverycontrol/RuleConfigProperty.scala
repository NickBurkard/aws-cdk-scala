package io.burkard.cdk.services.route53recoverycontrol

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleConfigProperty {

  def apply(
    inverted: Boolean,
    threshold: Number,
    `type`: String
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty.Builder)
      .inverted(inverted)
      .threshold(threshold)
      .`type`(`type`)
      .build()
}
