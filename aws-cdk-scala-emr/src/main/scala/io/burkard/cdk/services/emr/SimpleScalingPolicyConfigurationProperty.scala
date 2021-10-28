package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SimpleScalingPolicyConfigurationProperty {

  def apply(
    coolDown: Option[Number] = None,
    scalingAdjustment: Option[Number] = None,
    adjustmentType: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder)
      .coolDown(coolDown.orNull)
      .scalingAdjustment(scalingAdjustment.orNull)
      .adjustmentType(adjustmentType.orNull)
      .build()
}
