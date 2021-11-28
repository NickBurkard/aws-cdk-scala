package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ForwardConfigProperty {

  def apply(
    targetGroupStickinessConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty] = None,
    targetGroups: Option[List[_]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty.Builder)
      .targetGroupStickinessConfig(targetGroupStickinessConfig.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .build()
}
