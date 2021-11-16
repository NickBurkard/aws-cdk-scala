package io.burkard.cdk.services.elasticloadbalancing

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectionSettingsProperty {

  def apply(
    idleTimeout: Number
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty.Builder)
      .idleTimeout(idleTimeout)
      .build()
}
