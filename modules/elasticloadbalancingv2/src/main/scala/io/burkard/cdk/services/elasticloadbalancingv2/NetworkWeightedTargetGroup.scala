package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkWeightedTargetGroup {

  def apply(
    targetGroup: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup,
    weight: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup.Builder)
      .targetGroup(targetGroup)
      .weight(weight.orNull)
      .build()
}
