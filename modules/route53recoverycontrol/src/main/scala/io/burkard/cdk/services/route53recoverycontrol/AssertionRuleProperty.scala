package io.burkard.cdk.services.route53recoverycontrol

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssertionRuleProperty {

  def apply(
    waitPeriodMs: Option[Number] = None,
    assertedControls: Option[List[String]] = None
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty.Builder)
      .waitPeriodMs(waitPeriodMs.orNull)
      .assertedControls(assertedControls.map(_.asJava).orNull)
      .build()
}
