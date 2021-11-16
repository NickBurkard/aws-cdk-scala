package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SimpleScalingPolicyConfigurationProperty {

  def apply(
    scalingAdjustment: Number,
    coolDown: Option[Number] = None,
    adjustmentType: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.Builder)
      .scalingAdjustment(scalingAdjustment)
      .coolDown(coolDown.orNull)
      .adjustmentType(adjustmentType.orNull)
      .build()
}
