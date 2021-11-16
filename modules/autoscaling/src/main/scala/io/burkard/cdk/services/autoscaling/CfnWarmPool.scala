package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWarmPool {

  def apply(
    internalResourceId: String,
    autoScalingGroupName: String,
    maxGroupPreparedCapacity: Option[Number] = None,
    poolState: Option[String] = None,
    minSize: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.CfnWarmPool =
    software.amazon.awscdk.services.autoscaling.CfnWarmPool.Builder
      .create(stackCtx, internalResourceId)
      .autoScalingGroupName(autoScalingGroupName)
      .maxGroupPreparedCapacity(maxGroupPreparedCapacity.orNull)
      .poolState(poolState.orNull)
      .minSize(minSize.orNull)
      .build()
}
