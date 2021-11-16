package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WeightedTargetGroup {

  def apply(
    targetGroup: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup,
    weight: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup.Builder)
      .targetGroup(targetGroup)
      .weight(weight.orNull)
      .build()
}
