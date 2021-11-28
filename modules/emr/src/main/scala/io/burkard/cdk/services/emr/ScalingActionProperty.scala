package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingActionProperty {

  def apply(
    simpleScalingPolicyConfiguration: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty,
    market: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder)
      .simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
      .market(market.orNull)
      .build()
}
