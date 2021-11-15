package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingActionProperty {

  def apply(
    simpleScalingPolicyConfiguration: Option[software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty] = None,
    market: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.Builder)
      .simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.orNull)
      .market(market.orNull)
      .build()
}
