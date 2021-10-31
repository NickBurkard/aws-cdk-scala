package io.burkard.cdk.services.route53recoverycontrol

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatingRuleProperty {

  def apply(
    gatingControls: Option[List[String]] = None,
    waitPeriodMs: Option[Number] = None,
    targetControls: Option[List[String]] = None
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty.Builder)
      .gatingControls(gatingControls.map(_.asJava).orNull)
      .waitPeriodMs(waitPeriodMs.orNull)
      .targetControls(targetControls.map(_.asJava).orNull)
      .build()
}
