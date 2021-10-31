package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrafficRoutingConfig {

  def apply(
    timeBasedCanary: Option[software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary] = None,
    timeBasedLinear: Option[software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear] = None,
    `type`: Option[software.amazon.awscdk.CfnTrafficRoutingType] = None
  ): software.amazon.awscdk.CfnTrafficRoutingConfig =
    (new software.amazon.awscdk.CfnTrafficRoutingConfig.Builder)
      .timeBasedCanary(timeBasedCanary.orNull)
      .timeBasedLinear(timeBasedLinear.orNull)
      .`type`(`type`.orNull)
      .build()
}
