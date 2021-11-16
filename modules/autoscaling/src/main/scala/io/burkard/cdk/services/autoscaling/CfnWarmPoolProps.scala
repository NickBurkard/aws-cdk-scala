package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWarmPoolProps {

  def apply(
    autoScalingGroupName: String,
    maxGroupPreparedCapacity: Option[Number] = None,
    poolState: Option[String] = None,
    minSize: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps =
    (new software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps.Builder)
      .autoScalingGroupName(autoScalingGroupName)
      .maxGroupPreparedCapacity(maxGroupPreparedCapacity.orNull)
      .poolState(poolState.orNull)
      .minSize(minSize.orNull)
      .build()
}
