package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetGroupAttributes {

  def apply(
    targetGroupArn: String,
    loadBalancerArns: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes.Builder)
      .targetGroupArn(targetGroupArn)
      .loadBalancerArns(loadBalancerArns.orNull)
      .build()
}
