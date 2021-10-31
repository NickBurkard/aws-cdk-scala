package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetGroupTupleProperty {

  def apply(
    weight: Option[Number] = None,
    targetGroupArn: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty.Builder)
      .weight(weight.orNull)
      .targetGroupArn(targetGroupArn.orNull)
      .build()
}
