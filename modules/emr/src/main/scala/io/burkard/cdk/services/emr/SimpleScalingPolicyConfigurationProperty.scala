package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SimpleScalingPolicyConfigurationProperty {

  def apply(
    coolDown: Option[Number] = None,
    scalingAdjustment: Option[Number] = None,
    adjustmentType: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder)
      .coolDown(coolDown.orNull)
      .scalingAdjustment(scalingAdjustment.orNull)
      .adjustmentType(adjustmentType.orNull)
      .build()
}
