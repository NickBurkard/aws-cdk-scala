package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScalingActionProperty {

  def apply(
    simpleScalingPolicyConfiguration: Option[software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty] = None,
    market: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder)
      .simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.orNull)
      .market(market.orNull)
      .build()
}
