package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkWeightedTargetGroup {

  def apply(
    weight: Option[Number] = None,
    targetGroup: Option[software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup.Builder)
      .weight(weight.orNull)
      .targetGroup(targetGroup.orNull)
      .build()
}
