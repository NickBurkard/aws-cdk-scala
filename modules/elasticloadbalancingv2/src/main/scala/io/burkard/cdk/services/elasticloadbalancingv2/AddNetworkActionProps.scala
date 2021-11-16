package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddNetworkActionProps {

  def apply(
    action: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps.Builder)
      .action(action)
      .build()
}
