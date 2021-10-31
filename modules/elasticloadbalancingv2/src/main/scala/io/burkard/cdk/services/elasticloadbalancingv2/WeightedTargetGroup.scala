package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WeightedTargetGroup {

  def apply(
    weight: Option[Number] = None,
    targetGroup: Option[software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup.Builder)
      .weight(weight.orNull)
      .targetGroup(targetGroup.orNull)
      .build()
}
