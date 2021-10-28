package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetGroupAttributes {

  def apply(
    targetGroupArn: Option[String] = None,
    loadBalancerArns: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes.Builder)
      .targetGroupArn(targetGroupArn.orNull)
      .loadBalancerArns(loadBalancerArns.orNull)
      .build()
}
