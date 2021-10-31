package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SuspendedStateProperty {

  def apply(
    dynamicScalingInSuspended: Option[Boolean] = None,
    dynamicScalingOutSuspended: Option[Boolean] = None,
    scheduledScalingSuspended: Option[Boolean] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty.Builder)
      .dynamicScalingInSuspended(dynamicScalingInSuspended.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dynamicScalingOutSuspended(dynamicScalingOutSuspended.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .scheduledScalingSuspended(scheduledScalingSuspended.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
