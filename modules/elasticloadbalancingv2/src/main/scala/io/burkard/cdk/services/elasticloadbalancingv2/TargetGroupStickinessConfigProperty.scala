package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetGroupStickinessConfigProperty {

  def apply(
    enabled: Option[Boolean] = None,
    durationSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .durationSeconds(durationSeconds.orNull)
      .build()
}
