package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingActionProperty {

  def apply(
    simpleScalingPolicyConfiguration: software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty,
    market: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.Builder)
      .simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
      .market(market.orNull)
      .build()
}
