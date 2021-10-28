package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWarmPool {

  def apply(
    internalResourceId: String,
    maxGroupPreparedCapacity: Option[Number] = None,
    poolState: Option[String] = None,
    autoScalingGroupName: Option[String] = None,
    minSize: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.CfnWarmPool =
    software.amazon.awscdk.services.autoscaling.CfnWarmPool.Builder
      .create(stackCtx, internalResourceId)
      .maxGroupPreparedCapacity(maxGroupPreparedCapacity.orNull)
      .poolState(poolState.orNull)
      .autoScalingGroupName(autoScalingGroupName.orNull)
      .minSize(minSize.orNull)
      .build()
}
