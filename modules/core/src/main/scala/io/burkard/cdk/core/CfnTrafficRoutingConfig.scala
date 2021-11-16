package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrafficRoutingConfig {

  def apply(
    `type`: software.amazon.awscdk.CfnTrafficRoutingType,
    timeBasedCanary: Option[software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary] = None,
    timeBasedLinear: Option[software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear] = None
  ): software.amazon.awscdk.CfnTrafficRoutingConfig =
    (new software.amazon.awscdk.CfnTrafficRoutingConfig.Builder)
      .`type`(`type`)
      .timeBasedCanary(timeBasedCanary.orNull)
      .timeBasedLinear(timeBasedLinear.orNull)
      .build()
}
