package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
