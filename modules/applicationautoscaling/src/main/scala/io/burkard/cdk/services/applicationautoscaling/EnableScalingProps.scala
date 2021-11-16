package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnableScalingProps {

  def apply(
    maxCapacity: Number,
    minCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps =
    (new software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.Builder)
      .maxCapacity(maxCapacity)
      .minCapacity(minCapacity.orNull)
      .build()
}
