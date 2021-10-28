package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScalableTargetActionProperty {

  def apply(
    maxCapacity: Option[Number] = None,
    minCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.Builder)
      .maxCapacity(maxCapacity.orNull)
      .minCapacity(minCapacity.orNull)
      .build()
}
