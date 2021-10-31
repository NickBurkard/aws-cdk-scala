package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManagedScalingPolicyProperty {

  def apply(
    computeLimits: Option[software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty.Builder)
      .computeLimits(computeLimits.orNull)
      .build()
}
