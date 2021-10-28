package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SimpleScalingPolicyConfigurationProperty {

  def apply(
    coolDown: Option[Number] = None,
    scalingAdjustment: Option[Number] = None,
    adjustmentType: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.Builder)
      .coolDown(coolDown.orNull)
      .scalingAdjustment(scalingAdjustment.orNull)
      .adjustmentType(adjustmentType.orNull)
      .build()
}
