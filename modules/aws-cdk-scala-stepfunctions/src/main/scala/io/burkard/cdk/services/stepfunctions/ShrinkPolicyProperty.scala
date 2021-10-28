package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ShrinkPolicyProperty {

  def apply(
    instanceResizePolicy: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty] = None,
    decommissionTimeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty.Builder)
      .instanceResizePolicy(instanceResizePolicy.orNull)
      .decommissionTimeout(decommissionTimeout.orNull)
      .build()
}
