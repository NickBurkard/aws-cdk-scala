package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddNetworkActionProps {

  def apply(
    action: Option[software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps.Builder)
      .action(action.orNull)
      .build()
}
