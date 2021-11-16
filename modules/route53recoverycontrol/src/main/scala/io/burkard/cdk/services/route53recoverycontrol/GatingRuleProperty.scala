package io.burkard.cdk.services.route53recoverycontrol

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatingRuleProperty {

  def apply(
    gatingControls: List[String],
    waitPeriodMs: Number,
    targetControls: List[String]
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty.Builder)
      .gatingControls(gatingControls.asJava)
      .waitPeriodMs(waitPeriodMs)
      .targetControls(targetControls.asJava)
      .build()
}
