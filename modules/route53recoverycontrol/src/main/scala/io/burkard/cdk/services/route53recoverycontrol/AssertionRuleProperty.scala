package io.burkard.cdk.services.route53recoverycontrol

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssertionRuleProperty {

  def apply(
    waitPeriodMs: Number,
    assertedControls: List[String]
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty.Builder)
      .waitPeriodMs(waitPeriodMs)
      .assertedControls(assertedControls.asJava)
      .build()
}
