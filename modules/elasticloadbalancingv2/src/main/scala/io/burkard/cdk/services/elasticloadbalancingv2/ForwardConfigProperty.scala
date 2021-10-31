package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ForwardConfigProperty {

  def apply(
    targetGroupStickinessConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty] = None,
    targetGroups: Option[List[_]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty.Builder)
      .targetGroupStickinessConfig(targetGroupStickinessConfig.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .build()
}
