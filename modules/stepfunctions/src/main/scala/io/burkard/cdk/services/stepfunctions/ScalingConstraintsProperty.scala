package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScalingConstraintsProperty {

  def apply(
    maxCapacity: Option[Number] = None,
    minCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty.Builder)
      .maxCapacity(maxCapacity.orNull)
      .minCapacity(minCapacity.orNull)
      .build()
}
