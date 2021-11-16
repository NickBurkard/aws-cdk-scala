package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerTargetProps {

  def apply(
    targetType: software.amazon.awscdk.services.elasticloadbalancingv2.TargetType,
    targetJson: Option[AnyRef] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps.Builder)
      .targetType(targetType)
      .targetJson(targetJson.orNull)
      .build()
}
