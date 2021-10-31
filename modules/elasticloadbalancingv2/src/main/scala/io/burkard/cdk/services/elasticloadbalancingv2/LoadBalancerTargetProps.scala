package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerTargetProps {

  def apply(
    targetJson: Option[AnyRef] = None,
    targetType: Option[software.amazon.awscdk.services.elasticloadbalancingv2.TargetType] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps.Builder)
      .targetJson(targetJson.orNull)
      .targetType(targetType.orNull)
      .build()
}
